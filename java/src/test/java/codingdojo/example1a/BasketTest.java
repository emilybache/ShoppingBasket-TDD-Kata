package codingdojo.example1a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {
    @Test
    void Total_Over_100_Gives_Five_Percent_Discount() {
        var basket = new ShoppingBasket();
        var itemA = new BasketItem("A", 10);
        var itemB = new BasketItem("B", 25);
        var itemC = new BasketItem("C", 9.99);
        basket.add(itemA, 5);
        basket.add(itemB, 2);
        basket.add(itemC, 6);
        assertEquals(6, basket.getQuantity(itemC));
        assertEquals(151.94, basket.calculateTotal(), 0.01);
    }

}
