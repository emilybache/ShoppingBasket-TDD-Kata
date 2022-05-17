

#ifndef SHOPPINGBASKET_EXAMPLE1A_H
#define SHOPPINGBASKET_EXAMPLE1A_H


#include <string>
#include <map>

class BasketItem {
public:
    BasketItem(std::string name, double price): _name(name), _price(price) {};

    std::string getName() {
        return _name;
    }

private:
    std::string _name;
    double _price;
};

class ShoppingBasket {
public:
    int getQuantity(BasketItem item);

    void add(BasketItem basketItem, int quantity);

    double calculateTotal();

};

#endif //SHOPPINGBASKET_EXAMPLE1A_H
