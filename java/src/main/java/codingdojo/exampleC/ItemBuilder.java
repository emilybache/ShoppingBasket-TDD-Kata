package codingdojo.exampleC;

import java.math.BigDecimal;

public class ItemBuilder {
    public ItemBuilder(String name) {
    }

    public ItemBuilder withPrice(BigDecimal price) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public ItemBuilder withQuantity(double quantity) {
        throw new UnsupportedOperationException("Not implemented");
    }
    public Item build() {
        throw new UnsupportedOperationException("Not implemented");
    }
}
