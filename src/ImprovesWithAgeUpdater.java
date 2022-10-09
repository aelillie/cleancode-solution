/**
 * Item-updater for the {@code IMPROVES_WITH_AGE} category.
 */
public class ImprovesWithAgeUpdater extends ItemUpdater {

    @Override
    protected int getQualityDiff(Item item) {
        return 1;
    }
    
}
