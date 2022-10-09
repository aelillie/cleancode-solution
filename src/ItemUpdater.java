/**
 * Base class for all item updaters.
 * Takes care of updating properties, including item "sell in" and "quality" values.
 */
public abstract class ItemUpdater {
    public static final int MAX_QUALITY = 50;
    public static final int MIN_QUALITY = 0;
    public static final int SELL_IN_TODAY = 0;

    /**
     * Update an item's quality with respect to its category and decrease its sell-in value by 1.
     * @param item The item to update.
     */
    public void update(Item item) {
        updateSellIn(item);
        var qualityDiff = getQualityDiff(item);
        updateQuality(item, qualityDiff);
    }

    /**
     * Decrease the sell-in days by 1.
     * @param item The item to update the sell-in value for.
     */
    protected void updateSellIn(Item item) {
        item.sellIn--;
    }

    /**
     * Update the quality of the item with a specific value, either positive or negative.
     * If the resulting quality is below 0, the item quality defaults to 0.
     * If the resulting quality is above 50, the item quality defaults to 50
     * @param item The item to update the quality for.
     * @param qualityDiff The value to add or subtract from the item's quality.
     */
    protected void updateQuality(Item item, int qualityDiff) {
        if (item.quality + qualityDiff > MAX_QUALITY ) {
            item.quality = MAX_QUALITY;
        } else if (item.quality + qualityDiff < MIN_QUALITY) {
            item.quality = MIN_QUALITY;
        } else {
            item.quality += qualityDiff;
        }
    }

    /**
     * Specifies whether the item has reached its sell-in value.
     * @param item The item to check.
     * @return True, if this item's sell-in value is less than 0, false otherwise.
     */
    protected boolean isOverdue(Item item) {
        return item.sellIn < SELL_IN_TODAY;
    }

    /**
     * The category-specific calculation of how much an item's quality should be altered.
     * @param item The item to calculate the quality update for.
     * @return A number, either positive or negative, that indicates how much to add/subtract from the item's quality.
     */
    protected abstract int getQualityDiff(Item item);
}
