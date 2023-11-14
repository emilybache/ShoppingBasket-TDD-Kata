package codingdojo.exampleD;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {

    @Test
    @Disabled
    void Total_Over_100_Gives_Five_Percent_Discount() {
        String json = """
{
    "items": [
        {
            "name": "A",
                "price": 10.0,
                "quantity": 5
        },
        {
            "name": "B",
                "price": 25.0,
                "quantity": 2
        },
        {
            "name": "C",
                "price": 9.99,
                "quantity": 6
        }
    ]
}
        """;
        var basket = ShoppingBasketFactory.fromJson(json);

        assertEquals(6, basket.getQuantity("C"));
        assertEquals(new BigDecimal("151.94").doubleValue(),
                basket.calculateTotal().doubleValue(), 0.01);

    }
}
