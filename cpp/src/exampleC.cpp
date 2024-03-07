

#include "exampleC.h"

using namespace exampleC;

exampleC::ItemBuilder::ItemBuilder(string name){

}
ItemBuilder exampleC::ItemBuilder::withPrice(double price){
    throw "not implemented";
}
ItemBuilder exampleC::ItemBuilder::withQuantity(double quantity){
    throw "not implemented";
}
Item exampleC::ItemBuilder::build(){
    throw "not implemented";
}

double exampleC::ShoppingBasket::getQuantity(string name){
    throw "not implemented";

}
double exampleC::ShoppingBasket::calculateTotal(){
    throw "not implemented";
}

ShoppingBasketBuilder exampleC::ShoppingBasketBuilder::addItem(Item item){
    throw "not implemented";

}
ShoppingBasket exampleC::ShoppingBasketBuilder::build(){
    throw "not implemented";

}