package codingdojo.example1b;

import java.util.Map;

public class ShoppingBasket {
    @SafeVarargs
    public static ShoppingBasket fromItemQuantities(Map.Entry<Item, Integer>... entries) {
        return new ShoppingBasket();
    }

    public int getQuantity(String itemName) {
        return 0;
    }

    public Money totalPrice() {
        return Money.fromDollars(0);
    }
}
