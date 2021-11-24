package codingdojo.example2b;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {

    @Test
    void Total_Over_100_Gives_Five_Percent_Discount() {
        var basket = Map.of(
                new Item("A", 10.0),  5,
                new Item("B", 25.0), 2,
                new Item("C", 9.99), 6
        );
        Assertions.assertEquals(6, InventoryManager.getQuantity(basket, "C"));
        assertEquals(151.94, InventoryManager.calculateTotal(basket), 0.001);
    }
}
