
import { ShoppingBasketBuilder, ItemBuilder } from '../src/exampleC';

describe('BasketTest', () => {
  it.skip('Total over 100 gives five percent discount', () => {
    const basket = new ShoppingBasketBuilder()
      .addItem(new ItemBuilder('A').withPrice(10.0).withQuantity(5).build())
      .addItem(new ItemBuilder('B').withPrice(25.0).withQuantity(2).build())
      .addItem(new ItemBuilder('C').withPrice(9.99).withQuantity(6).build())
      .build();

    expect(basket.getQuantity('C')).toBe(6);
    expect(basket.totalPrice()).toBeCloseTo(151.94, 2);
  });
});
