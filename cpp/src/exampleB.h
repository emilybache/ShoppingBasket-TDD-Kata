

#ifndef SHOPPINGBASKET_EXAMPLE2B_H
#define SHOPPINGBASKET_EXAMPLE2B_H


#include <map>
using namespace  std;

namespace exampleB {


    class BasketAnalysis {
    public:
        static double getQuantity(string itemName, unordered_map<string, unordered_map<string, string>> basket);

        static double calculateTotal(unordered_map<string, unordered_map<string, string>> basket);
    };


}
#endif //SHOPPINGBASKET_EXAMPLE2B_H
