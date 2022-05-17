

#ifndef SHOPPINGBASKET_EXAMPLE1B_H
#define SHOPPINGBASKET_EXAMPLE1B_H

using namespace  std;

class example1b {

};

class Money {
public:
    static int fromDollars(double amount);
};

class BasketItem {

public:
    BasketItem(std::string name, int price);
};

class ShoppingBasket {
public:
    static ShoppingBasket fromItemQuantities(
            tuple<BasketItem, int> item1,
            tuple<BasketItem, int> item2,
            tuple<BasketItem, int> item3
                                             );

    int getQuantity(BasketItem basketItem);

    int calculateTotal();
};


#endif //SHOPPINGBASKET_EXAMPLE1B_H
