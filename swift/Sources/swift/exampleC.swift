import Foundation

class ShoppingBasketBuilder {

    func addItem(item: BasketItem) -> ShoppingBasketBuilder{
        fatalError("NotImplementedError: addItem function not implemented")
    }

    func build() -> ShoppingBasket {
        fatalError("NotImplementedError: build function not implemented")
    }
}

class ItemBuilder {
    
    init(_ name: String) {
        fatalError("NotImplementedError: ItemBuilder initializer not implemented")
    }

    func withPrice(_ price: Double) -> ItemBuilder {
        fatalError("NotImplementedError: withPrice function not implemented")
    }

    func withQuantity(_ quantity: Int) -> ItemBuilder {
        fatalError("NotImplementedError: withQuantity function not implemented")
    }

    func build() -> BasketItem {
        fatalError("NotImplementedError: build function not implemented")
    }
}
