import {ShoppingBasketFactory} from "../src/exampleD";


describe('BasketTest', () => {
  it.skip('Total_Over_100_Gives_Five_Percent_Discount', () => {
    const json = `
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
        `;
    const basket = ShoppingBasketFactory.fromJson(json);

    expect(basket.getQuantity("C")).toBe(6);
    expect(basket.calculateTotal()).toBeCloseTo(151.94, 2);
  });
});
