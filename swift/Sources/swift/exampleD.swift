import Foundation

class ShoppingBasketFactory {
 
    func getQuantity(of itemName: String) -> Int {
        fatalError("NotImplementedError: getQuantity function not implemented")
    }

    func calculateTotal() -> Decimal {
        fatalError("NotImplementedError: calculateTotal function not implemented")
    }
    
    static func fromJson(json: String) throws -> ShoppingBasket{
        fatalError("NotImplementedError: from_json function not implemented")
    }
}
