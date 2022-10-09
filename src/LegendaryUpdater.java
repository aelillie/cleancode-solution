/**
 * Item-updater for the {@code LEGENDARY} category.
 */
public class LegendaryUpdater extends ItemUpdater {

    @Override
    protected int getQualityDiff(Item item) {
        return 0;
    }

    @Override
    protected void updateSellIn(Item item) {
        // legendary items never have to be sold, so don't update sell-in.
    }
 
}
