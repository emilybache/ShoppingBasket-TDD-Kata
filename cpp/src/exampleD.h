

#ifndef SHOPPINGBASKET_EXAMPLED_H
#define SHOPPINGBASKET_EXAMPLED_H

#include <string>

using namespace std;

namespace exampleD {

    class ShoppingBasket {
    public:
        double getQuantity(string name);
        double calculateTotal();
    };

    class ShoppingBasketFactory {
    public:
        static ShoppingBasket fromJson(string json);
    };
}


#endif //SHOPPINGBASKET_EXAMPLED_H
