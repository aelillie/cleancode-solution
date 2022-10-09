import java.util.Arrays;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.asList(items).forEach(item -> {
            var itemUpdater = UpdaterFactory.getItemUpdater(item);
            itemUpdater.update(item);
        });
    }
}