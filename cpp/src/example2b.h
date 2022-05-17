

#ifndef SHOPPINGBASKET_EXAMPLE2B_H
#define SHOPPINGBASKET_EXAMPLE2B_H


#include <map>

class example2b {

};

class Money {
public:
    static Money fromDollars(double amount);
        bool operator==(const Money &rhs) const;

};

class InventoryManager {

public:
    static Money calculateTotal(std::map<std::tuple<std::string, Money>, int> basket);
    static int getQuantity(std::map<std::tuple<std::string, Money>, int> basket, std::string itemName);
};

#endif //SHOPPINGBASKET_EXAMPLE2B_H
