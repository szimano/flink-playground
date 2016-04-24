package london;

import org.apache.flink.api.common.functions.FoldFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.source.SourceFunction;
import org.apache.flink.streaming.api.windowing.time.Time;
import london.jaxb.disruption.DisruptionType;
import london.jaxb.disruption.ObjectFactory;
import london.jaxb.header.HeaderType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.net.URL;
import java.util.Scanner;

public class LondonTransportAnalysis {

    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment see = StreamExecutionEnvironment.getExecutionEnvironment();

        DataStreamSource<String> source = see.addSource(new SourceFunction<String>() {

            boolean running = true;

            @Override
            public void run(SourceContext<String> ctx) throws Exception {
                URL url = new URL("https://data.tfl.gov.uk/tfl/syndication/feeds/tims_feed.xml?app_id=284729d2&app_key=3a6bdfee3c6e1e5b65f7286c5c7d6fce");

                Scanner scanner = new Scanner(url.openStream());

                readHeader(scanner);

                String segment = "";
                String line = "";

                while (running) {
                    do {
                        if (scanner.hasNextLine()) {
                            line = scanner.nextLine();
                            if (line.trim().equals("</Disruptions>")) {
                                System.out.println("KONIEC");
                                Thread.sleep(1000);
                                scanner.close();
                                scanner = new Scanner(url.openStream());
                                readHeader(scanner);
                            }
                            segment += line + "\n";
                        } else {
                            Thread.sleep(100);
                        }
                    } while (!line.trim().equals("</Disruption>"));

                    System.out.println("segment = " + segment);
                    running = false;
                    ctx.collect(segment);

                    JAXBContext jaxbContext = JAXBContext.newInstance(DisruptionType.class, ObjectFactory.class);
                    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
                    JAXBElement<DisruptionType> disruptionType = (JAXBElement<DisruptionType>) unmarshaller.unmarshal(new StringReader(segment));

                    System.out.println("disruptionType = " + disruptionType.getValue());
                    segment = "";

                }

                scanner.close();
            }

            private void readHeader(Scanner scanner) throws JAXBException {
                // ignore XML shoebang
                scanner.nextLine();
                scanner.nextLine();

                String segment = "";
                String line;

                do {
                    line = scanner.nextLine();
                    segment += line + "\n";
                } while (!line.trim().equals("</Header>"));

                JAXBContext jaxbContext = JAXBContext.newInstance(HeaderType.class, london.jaxb.header.ObjectFactory.class);
                Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
                JAXBElement<HeaderType> header = (JAXBElement<HeaderType>) unmarshaller.unmarshal(new StringReader(segment));


                System.out.println("header = " + header.getValue());

                // ignore Disruptions tag
                System.out.println(scanner.nextLine());
            }

            @Override
            public void cancel() {
                running = false;
            }
        });

        SingleOutputStreamOperator<Tuple2<String, Long>> results =
                source.timeWindowAll(Time.seconds(5))
                        .fold(new Tuple2<String, Long>("", 0L), new FoldFunction<String, Tuple2<String, Long>>() {
                            @Override
                            public Tuple2<String, Long> fold(Tuple2<String, Long> acc, String event) throws Exception {
                                acc.f0 = "events";
                                acc.f1 += 1L;
                                return acc;
                            }
                        });

        results.print();

        see.execute();
    }
}