import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void whenUpdateQuality_andItemIsProvided_thenNameIsCorrect() {
        // Arrange
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);

        // Act
        app.updateQuality();

        // Assert
        assertEquals("foo", app.items[0].name);
    }

    @Test
    void whenUpdateQuality_andItemIsProvided_thenQualityIsCorrect() {
        // Arrange
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 5, 5) };
        GildedRose app = new GildedRose(items);

        // Act
        app.updateQuality();

        // Assert
        assertEquals(3, app.items[0].quality);
    }

}
