package creational;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.JSONArray;
import java.io.IOException;
import java.io.StringWriter;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private JSONObject JsonPrinter;
    private JSONArray JsonArray;


    public JSONBookMetadataFormatter() throws IOException{
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        JsonPrinter = new JSONObject();
        JsonArray = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONObject book = new JSONObject();
        JSONArray authors = new JSONArray();

        book.put("ISBN", b.getISBN());

        for (String meta : b.getAuthors()){
            authors.add(meta);
        }
        book.put("Authors", authors);
        book.put("Title", b.getTitle());
        book.put("Publisher", b.getPublisher());


        JsonArray.add(book);
        JsonPrinter.put("Books",JsonArray);
        return this;
    }

    @Override
    public String getMetadataString() {
        return JsonPrinter.toString();
    }
}
