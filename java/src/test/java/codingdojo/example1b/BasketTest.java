package codingdojo.example1b;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {
    @Test
    void Total_Over_100_Gives_Five_Percent_Discount() {
        var itemA = new Item("A", Money.fromDollars(10.0));
        var itemB = new Item("B", Money.fromDollars(25.0));
        var itemC = new Item("C", Money.fromDollars(9.99));
        var basket = ShoppingBasket.fromItemQuantities(
                Map.entry(itemA, 5),
                Map.entry(itemB, 2),
                Map.entry(itemC, 6)
        );
        assertEquals(6, basket.getQuantity("C"));
        assertEquals(Money.fromDollars(151.94), basket.totalPrice());
    }
}
