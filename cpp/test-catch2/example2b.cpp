#include "catch2/catch.hpp"
#include "example2b.h"

#include <map>

TEST_CASE ("ShoppingBasket") {
    SECTION("total over 100 gives five percent discount") {
        std::tuple<std::string, Money> itemA = {"A", Money::fromDollars(10.0)};
        std::tuple<std::string, Money> itemB = {"B", Money::fromDollars(25.0)};
        std::tuple<std::string, Money> itemC = {"C", Money::fromDollars(9.99)};
        std::map<std::tuple<std::string, Money>, int> basket = {
                        {itemA, 5},
                        {itemB, 2},
                        {itemC, 6}
                        };


        CHECK(6 == InventoryManager::getQuantity(basket, "C"));
        CHECK(Money::fromDollars(151.94) == InventoryManager::calculateTotal(basket));
    }
}




