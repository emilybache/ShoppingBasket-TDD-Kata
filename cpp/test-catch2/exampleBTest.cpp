#include "catch2/catch.hpp"
#include "exampleB.h"

using namespace  std;
using namespace exampleB;

TEST_CASE ("ShoppingBasketB") {
    SECTION("total over 100 gives five percent discount") {
        unordered_map<string, string> itemA = {{"price", "10.0"}, {"quantity", "5"}};
        unordered_map<string, string> itemB = {{"price", "25.0"}, {"quantity", "2"}};
        unordered_map<string, string> itemC = {{"price", "9.99"}, {"quantity", "6"}};
        unordered_map<string, unordered_map<string, string>> basket = {
                {"A", itemA},
                {"B", itemB},
                {"C", itemC}
        };

        CHECK(6 == BasketAnalysis::getQuantity("C", basket));
        CHECK(151.94 == Approx(BasketAnalysis::calculateTotal(basket)).margin(0.01));
    }
}



