package codingdojo.example2a;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {
    @Test
    void Total_Over_100_Gives_Five_Percent_Discount() {
        var itemA = Map.entry("A", 10.0);
        var itemB = Map.entry("B", 25.0);
        var itemC = Map.entry("C", 9.99);
        var allItems = List.of(itemA, itemB, itemC);
        var basket = List.of(
                Map.entry("A", 5),
                Map.entry("B", 2),
                Map.entry("C", 6));
        var manager = new InventoryManager(allItems);
        assertEquals(6, manager.getQuantity(basket, "C"));
        assertEquals(151.94, manager.calculateTotal(basket), 0.01);
    }

}
