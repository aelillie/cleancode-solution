/**
 * Item-updater for the {@code BACKSTAGE_PASSES} category.
 */
public class BackStagePassesUpdater extends ItemUpdater {

    @Override
    protected int getQualityDiff(Item item) {
        var qualityUpdate = 0;
        if (isOverdue(item)) {
            // QualityUpdate drops to 0 after the concert
            qualityUpdate = -item.quality;
        } else {
            // The concert has not yet been held
            qualityUpdate = 1;
            qualityUpdate += getQualityUpdateWhenCloseToSellIn(item);
        }
        return qualityUpdate;
    }

    private int getQualityUpdateWhenCloseToSellIn(Item item) {
        var qualityUpdateDiff = 0;
        if (item.sellIn <= 10) {
            qualityUpdateDiff++;
        }
        if (item.sellIn <= 5) {
            qualityUpdateDiff++;
        }
        return qualityUpdateDiff;
    }
    
}
