

#ifndef SHOPPINGBASKET_EXAMPLE2A_H
#define SHOPPINGBASKET_EXAMPLE2A_H

class example2a {

};

class InventoryManager {

public:
    InventoryManager(std::vector<std::tuple<std::string, double>> all_items);

    int getQuantity(std::vector<std::tuple<std::string, int>> basket,
                     std::string itemName);

    double calculateTotal(std::vector<std::tuple<std::string, int>> basket);
};

#endif //SHOPPINGBASKET_EXAMPLE2A_H
