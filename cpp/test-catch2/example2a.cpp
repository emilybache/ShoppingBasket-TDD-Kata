#include "catch2/catch.hpp"
#include "example2a.h"


TEST_CASE ("ShoppingBasket") {
    SECTION("total over 100 gives five percent discount") {
        std::tuple<std::string, double> itemA = {"A", 10.0};
        std::tuple<std::string, double> itemB = {"B", 25.0};
        std::tuple<std::string, double> itemC = {"C", 9.99};
        auto allItems = std::vector<std::tuple<std::string, double>>();
        allItems.emplace_back(itemA);
        allItems.emplace_back(itemB);
        allItems.emplace_back(itemC);
        auto basket = std::vector<std::tuple<std::string, int>>();
        basket.emplace_back("A", 5);
        basket.emplace_back("B", 2);
        basket.emplace_back("C", 6);

        auto manager = InventoryManager(allItems);
        CHECK(6 == manager.getQuantity(basket, "C"));
        CHECK(151.94 == Approx(manager.calculateTotal(basket)).margin(0.01));
    }
}



