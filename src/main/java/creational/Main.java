package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Current usage
//        BookMetadataFormatter formatter = null;
//        try {
//            formatter = BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.CSV);
//            formatter.append(TestData.dragonBook);
//            formatter.append(TestData.dinosaurBook);
//            System.out.print(formatter.getMetadataString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        }

        // Expected usage
        System.out.println("XML");
        try {
            BookMetadataExporter exporter = new XMLBookMetadataExporter();
            exporter.add(TestData.sailboatBook);
            exporter.add(TestData.GoFBook);
            exporter.export(System.out);
        }catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        System.out.println("CSV");
        try {
            BookMetadataExporter exporter = new CSVBookMetadataExporter();
            exporter.add(TestData.sailboatBook);
            exporter.add(TestData.GoFBook);
            exporter.export(System.out);
        }catch (ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }

        System.out.println("JSON");
        try {
            BookMetadataExporter exporter = new JSONBookMetadataExporter();
            exporter.add(TestData.sailboatBook);
            exporter.add(TestData.GoFBook);
            exporter.export(System.out);
        }catch (ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }

    }
}
