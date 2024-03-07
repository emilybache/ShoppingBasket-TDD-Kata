#include "catch2/catch.hpp"
#include "exampleA.h"

using namespace exampleA;

TEST_CASE ("ShoppingBasketA") {
    SECTION("total over 100 gives five percent discount") {
        auto basket = ShoppingBasket();
        auto itemA = BasketItem("A", 10);
        auto itemB = BasketItem("B", 25);
        auto itemC = BasketItem("C", 9.99);
        basket.add(itemA, 5);
        basket.add(itemB, 2);
        basket.add(itemC, 6);

        CHECK(basket.getQuantity(itemC) == 6);
        CHECK(basket.calculateTotal() == Approx(151.94).margin(0.01));
    }
}


