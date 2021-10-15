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
//            เรียก function ตรงนี้
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        }

        // Expected usage
        try {
            BookMetadataExporter exporter = new XMLBookMetadataExporter();
            exporter.add(TestData.sailboatBook);
            exporter.add(TestData.GoFBook);
            exporter.export(System.out);
        }catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

    }
}