#include "catch2/catch.hpp"
#include "example1b.h"

TEST_CASE ("ShoppingBasket") {
    SECTION("total over 100 gives five percent discount") {
        auto itemA = BasketItem("A", Money::fromDollars(10));
        auto itemB = BasketItem("B", Money::fromDollars(25));
        auto itemC = BasketItem("C", Money::fromDollars(9.99));
        auto basket = ShoppingBasket::fromItemQuantities(
                {itemA, 5},
                {itemB, 2},
                {itemC, 6}
        );
        CHECK(basket.getQuantity(itemC) == 6);
        CHECK(basket.calculateTotal() == Money::fromDollars(151.94));
    }
}


