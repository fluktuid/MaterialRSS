import java.util.ArrayList;
import java.util.List;

/**
 * Created by lfp on 22.02.2017.
 */

public class Feed {
    public ArrayList<Item> items;

    public Feed(List<Item> items) {
        items = new ArrayList<>(items);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public Item getItem(int position) {
        return items.get(position);
    }
}
