import {BasketItem, ShoppingBasket} from '../src/exampleA'


describe("ShoppingBasket", () => {
  it.skip("should calculate total with discount", () => {
    const basket = new ShoppingBasket();
    let item_a = new BasketItem("A", 10)
    let item_b = new BasketItem("B", 25)
    let item_c = new BasketItem("C", 9.99)
    basket.add(item_a, 5);
    basket.add(item_b, 2);
    basket.add(item_c, 6);
    expect(basket.get_quantity("C")).toBe(6);
    expect(basket.calculate_total()).toBeCloseTo(151.94, 2);
  });
});
