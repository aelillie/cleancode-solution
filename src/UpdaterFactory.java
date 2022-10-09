import java.util.HashMap;
import java.util.Map;

/**
 * Factory class for producing item-updaters, based on an item's category.
 */
public class UpdaterFactory {
    private static Map<ItemCategory, ItemUpdater> itemCategoryUpdaters = new HashMap<>();
    static {
        itemCategoryUpdaters.put(ItemCategory.LEGENDARY, new LegendaryUpdater());
        itemCategoryUpdaters.put(ItemCategory.IMPROVES_WITH_AGE, new ImprovesWithAgeUpdater());
        itemCategoryUpdaters.put(ItemCategory.BACKSTAGEPASS, new BackStagePassesUpdater());
        itemCategoryUpdaters.put(ItemCategory.CONJURED, new ConjuredUpdater());
        itemCategoryUpdaters.put(ItemCategory.COMMON, new CommonUpdater());
    }

    /**
     * Return an {@code ItemUpdater} based on the item's category, which is specified by {@code ItemCatalog}.
     * @param currentItem The item to update.
     * @return An item-updater for the specific item's category.
     */
    public static ItemUpdater getItemUpdater(Item currentItem) {
        var category = ItemCatalog.gItemCategory(currentItem.name);
        return itemCategoryUpdaters.get(category);
    }
}
