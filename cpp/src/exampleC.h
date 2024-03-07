

#ifndef SHOPPINGBASKET_EXAMPLEC_H
#define SHOPPINGBASKET_EXAMPLEC_H

#include <string>

using namespace std;

namespace exampleC {

    class Item {
    public:

    };

    class ItemBuilder {
    public:
        ItemBuilder(string name);

        ItemBuilder withPrice(double price);

        ItemBuilder withQuantity(double quantity);

        Item build();
    };

    class ShoppingBasket {
    public:
        double getQuantity(string name);

        double calculateTotal();
    };

    class ShoppingBasketBuilder {
    public:
        ShoppingBasketBuilder addItem(Item item);

        ShoppingBasket build();
    };

}
#endif //SHOPPINGBASKET_EXAMPLEC_H
