import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 * Created by lfp on 22.02.2017.
 */

public class Parser {
    private String url;

    public Parser(String url) {
        this.url = url;
    }

    public void parse() {
        Document document = Jsoup.parse(url,"", org.jsoup.parser.Parser.xmlParser());
        for(Element e : document.select("item")) {
            String title, link, description, pubDate, keywords[];
        }
    }
}
