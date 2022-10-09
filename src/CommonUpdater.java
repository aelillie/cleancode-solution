/**
 * Item-updater for the {@code COMMON} category.
 */
public class CommonUpdater extends ItemUpdater {

    @Override
    protected int getQualityDiff(Item item) {
        var qualityUpdate = -1;
        if (isOverdue(item)) {
            qualityUpdate--;
        }
        return qualityUpdate;
    }
    
}
