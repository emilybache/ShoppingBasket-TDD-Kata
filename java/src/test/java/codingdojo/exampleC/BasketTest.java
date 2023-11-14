package codingdojo.exampleC;

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
        var basket = new ShoppingBasketBuilder()
                .addItem(new ItemBuilder("A").withPrice(new BigDecimal("10.0")).withQuantity(5).build())
                .addItem(new ItemBuilder("B").withPrice(new BigDecimal("25.0")).withQuantity(2).build())
                .addItem(new ItemBuilder("C").withPrice(new BigDecimal("9.99")).withQuantity(6).build())
                .build();
        assertEquals(6, basket.getQuantity("C"));
        assertEquals(new BigDecimal("151.94").doubleValue(),
                basket.totalPrice().doubleValue(), 0.01);

    }
}
