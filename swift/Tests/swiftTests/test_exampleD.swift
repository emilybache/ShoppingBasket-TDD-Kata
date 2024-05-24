import XCTest
@testable import swift

/*
 * Implement tests in this order:
 *
 * Empty basket - basket contains no items
 * one item "A" - basket contains 1 item "A"
 * two items "A" - basket contains 2 items "A"
 * two items, "A" and "B" - basket contains 1 item "A"
 * Empty basket - total price 0
 * "A" costs $10, basket contains one "A" - total $10
 * "D" costs $160, basket contains one "D" - total $152 (5% discount)
 * "E" costs $250, basket contains one "E" - total $225 (10% discount)
 * Then remove the "Ignore" marking on the test that's here and hopefully it will pass!
 */

final class test_exampleD: XCTestCase {
    
    func test_total_over_100_gives_five_percent_discount() throws {
        /// to allow test to run, comment the next line
        try XCTSkipUnless(false)
        
        let jsonString = """
      {
        "items": [
          {
            "name": "A",
            "price": 10.0,
            "quantity": 5
          },
          {
            "name": "B",
            "price": 25.0,
            "quantity": 2
          },
          {
            "name": "C",
            "price": 9.99,
            "quantity": 6
          }
        ]
      }
      """
        
        let basket = try ShoppingBasketFactory.fromJson(json: jsonString)
        
        XCTAssertEqual(
            basket.getQuantity(of: "C"),
            6,
            "Quantity of item 'C' should be 6"
        )
        XCTAssertEqual(
            basket.calculateTotal(),
            Decimal(151.94),
            accuracy: 0.01,
            "Total should be approximately 151.94"
        )
    }
    
}
