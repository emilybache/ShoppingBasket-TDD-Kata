package codingdojo.exampleA;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Implement tests in this order:
 *
 * Empty basket - basket contains no items
 * one item "A" - basket contains 1 item "A"
 * two items "A" - basket contains 2 items "A"
 * two items, "A" and "B" - basket contains 1 item "A"
 * Empty basket - total price 0
 * "A" costs $10, basket contains one "A" - total $10
 * "D" costs $160, basket contains one "D" - total $152 (5% discount)
 * "E" costs $250, basket contains one "E" - total $225 (10% discount)
 * Then remove the "Disabled" marking on the test that's here and hopefully it will pass!
 */
public class BasketTest {
    @Test
    @Disabled
    void Total_Over_100_Gives_Five_Percent_Discount() {
        var basket = new ShoppingBasket();
        var itemA = new BasketItem("A", new BigDecimal(10));
        var itemB = new BasketItem("B", new BigDecimal(25));
        var itemC = new BasketItem("C", new BigDecimal("9.99"));
        basket.add(itemA, 5);
        basket.add(itemB, 2);
        basket.add(itemC, 6);
        assertEquals(6, basket.getQuantity("C"));
        assertEquals(new BigDecimal("151.94").doubleValue(),
                basket.calculateTotal().doubleValue(), 0.01);
    }
}
