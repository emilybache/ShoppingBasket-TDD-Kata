import {ShoppingBasket} from '../src/exampleA'


describe("ShoppingBasket", () => {
  it.skip("should calculate total with discount", () => {
    const basket = new ShoppingBasket();
    basket.add("A", 5);
    basket.add("B", 2);
    basket.add("C", 6);
    expect(basket.get_quantity("C")).toBe(6);
    expect(basket.calculate_total()).toBeCloseTo(151.94, 2);
  });
});
