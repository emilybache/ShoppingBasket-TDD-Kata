package codingdojo.example3a;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {

    @Test
    void Total_Over_100_Gives_Five_Percent_Discount() {
        var basket = new ShoppingBasket();
        basket.add("A", new BigDecimal("10.0"), 5);
        basket.add("B", new BigDecimal("25.0"), 2);
        basket.add("C", new BigDecimal("9.99"), 6);

        BigDecimal total = basket.getTotal();
        assertEquals(new BigDecimal("151.94"), total);
    }
}
