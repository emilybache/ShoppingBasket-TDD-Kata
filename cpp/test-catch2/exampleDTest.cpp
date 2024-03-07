#include "catch2/catch.hpp"
#include "exampleD.h"

using namespace  std;
using namespace exampleD;

TEST_CASE ("ShoppingBasketD") {
    SECTION("total over 100 gives five percent discount") {
        string json = R""""(
{
    "items": [
        {"name": "A", "price": 10.0, "quantity": 5},
        {"name": "B", "price": 25.0, "quantity": 2},
        {"name": "C", "price": 9.99, "quantity": 6}
    ]
}
                      )"""";
        ShoppingBasket basket = ShoppingBasketFactory::fromJson(json);

        CHECK(6 == basket.getQuantity("C"));
        CHECK(151.94 == Approx(basket.calculateTotal()).margin(0.01));
    }
}



