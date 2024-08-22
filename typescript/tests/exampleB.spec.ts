
import { findQuantity, calculateTotal } from '../src/exampleB';

describe('Basket calculations', () => {
  it.skip('should give a five percent discount for totals over 100', () => {
    const basket = {
      "A": { quantity: 5, price: 10 },
      "B": { quantity: 2, price: 25 },
      "C": { quantity: 6, price: 9.99 },
    };

    expect(findQuantity(basket, "C")).toBe(6);
    expect(calculateTotal(basket)).toBeCloseTo(151.94, 2);
  });
});
