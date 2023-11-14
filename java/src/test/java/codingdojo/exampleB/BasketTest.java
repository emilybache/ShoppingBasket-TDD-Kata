package codingdojo.exampleB;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

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
        var basket = new HashMap<String, Object>();
        var itemA = Map.ofEntries(
                Map.entry("price", new BigDecimal("10.0")),
                Map.entry("quantity", 5.0)
        );
        var itemB = Map.ofEntries(
                Map.entry("price", new BigDecimal("25.0")),
                Map.entry("quantity", 2.0)
        );
        var itemC = Map.ofEntries(
                Map.entry("price", new BigDecimal("9.99")),
                Map.entry("quantity", 6.0)
        );
        basket.put("A", itemA);
        basket.put("B", itemB);
        basket.put("C", itemC);
        assertEquals(6, BasketAnalysis.getQuantity(basket, "C"));
        assertEquals(new BigDecimal("151.94").doubleValue(),
                BasketAnalysis.calculateTotal(basket).doubleValue(), 0.01);
    }

}
