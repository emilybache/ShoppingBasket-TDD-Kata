package codingdojo.example3b;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {

    @Test
    void Total_Over_100_Gives_Five_Percent_Discount() {
        var basket = new ShoppingBasket();
        basket.add(new Purchase("A", new BigDecimal("10.0"), 5));
        basket.add(new Purchase("B", new BigDecimal("25.0"), 2));
        basket.add(new Purchase("C", new BigDecimal("9.99"), 6));

        BigDecimal total = basket.getTotal();
        assertEquals("151.94", total.toString());
    }
}
