

#ifndef SHOPPINGBASKET_EXAMPLEA_H
#define SHOPPINGBASKET_EXAMPLEA_H


#include <string>
#include <map>

namespace exampleA{

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

}
#endif //SHOPPINGBASKET_EXAMPLEA_H
