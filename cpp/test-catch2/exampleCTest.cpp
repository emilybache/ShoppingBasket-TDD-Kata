#include "catch2/catch.hpp"
#include "exampleC.h"

using namespace  std;
using namespace exampleC;

TEST_CASE ("ShoppingBasketC") {
    SECTION("total over 100 gives five percent discount") {
        ShoppingBasket basket = ShoppingBasketBuilder()
                .addItem(ItemBuilder("A").withPrice(10.0).withQuantity(5).build())
                .addItem(ItemBuilder("B").withPrice(25.0).withQuantity(2).build())
                .addItem(ItemBuilder("C").withPrice(9.99).withQuantity(6).build())
                .build();

        CHECK(6 == basket.getQuantity("C"));
        CHECK(151.94 == Approx(basket.calculateTotal()).margin(0.01));
    }
}



