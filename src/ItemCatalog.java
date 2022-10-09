import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Specification for all of the items and their relation to their category.
 * For all items with no specific category, the item is assigned a category of {@code COMMON}.
 */
public class ItemCatalog {
    private static Map<ItemCategory, List<String>> categoryToItemNames = new HashMap<>();
    static {
        categoryToItemNames.put(ItemCategory.LEGENDARY, List.of("Sulfuras, Hand of Ragnaros"));
        categoryToItemNames.put(ItemCategory.BACKSTAGEPASS, List.of("Backstage passes to a TAFKAL80ETC concert"));
        categoryToItemNames.put(ItemCategory.IMPROVES_WITH_AGE, List.of("Aged Brie"));
        categoryToItemNames.put(ItemCategory.CONJURED, List.of("Conjured Mana Cake"));
        categoryToItemNames.put(ItemCategory.COMMON, Collections.emptyList());
    }

    /**
     * Get the category for an item, based on its name.
     * @param itemName The item for which to get the category.
     * @return The specific category for the item, or {@code COMMON} if the item is not specifically part of the catalog.
     */
    public static ItemCategory gItemCategory(String itemName) {
        for(var entry : categoryToItemNames.entrySet()) {
            var category = entry.getKey();
            var names = entry.getValue();
            if (names.contains(itemName)) {
                return category;
            }
        }
        return ItemCategory.COMMON;
    }

}
