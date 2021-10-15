package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {
    public void add(Book b) {

    }
    public void export(PrintStream stream) {

    }
}


class XMLBookMetadataExporter extends BookMetadataExporter{
    BookMetadataFormatter formatter = new XMLBookMetadataFormatter();
    XMLBookMetadataExporter() throws ParserConfigurationException {
    }
    public void add(Book b) {
        formatter.append(b);
    }
    public void export(PrintStream stream) {
        stream.println(formatter.getMetadataString());
    }
}


class CSVBookMetadataExporter extends BookMetadataExporter{
    BookMetadataFormatter formatter = new CSVBookMetadataFormatter();
    CSVBookMetadataExporter() throws ParserConfigurationException, IOException {
    }
    public void add(Book b) {
        formatter.append(b);
    }
    public void export(PrintStream stream) {
        stream.println(formatter.getMetadataString());
    }
}


class JSONBookMetadataExporter extends BookMetadataExporter{
    BookMetadataFormatter formatter = new JSONBookMetadataFormatter();
    JSONBookMetadataExporter() throws ParserConfigurationException, IOException {
    }
    public void add(Book b) {
        formatter.append(b);
    }
    public void export(PrintStream stream) {
        stream.println(formatter.getMetadataString());
    }
}