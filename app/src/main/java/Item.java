/**
 * Created by lfp on 22.02.2017.
 */

public class Item {
    String title, link, description, pubDate, keywords[];

    public Item(String title, String link, String description, String pubDate, String[] keywords) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.pubDate = pubDate;
        this.keywords = keywords;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String[] getKeywords() {
        return keywords;
    }
}
