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

final class test_exampleB: XCTestCase {
    
    func test_total_over_100_gives_five_percent_discount() throws {
        /// to allow test to run, comment the next line
        try XCTSkipUnless(false)
        
        let basket: ShoppingBasketAsDict = [
            "A": ["quantity": 5, "price": 10],
            "B": ["quantity": 2, "price": 25],
            "C": ["quantity": 6, "price": 9.99],
        ]

        XCTAssertEqual(
            findQuantity(
                basket: basket,
                of: "C"
            ),
            6,
            "Quantity of item 'C' should be 6"
        )
        XCTAssertEqual(
            calculateTotal(
                basket: basket
            ),
            151.94,
            accuracy: 0.01,
            "Total should be approximately 151.94"
        )

    }
    
}
