
export class ShoppingBasket {
  add(item: BasketItem, quantity: number): void {
    throw new Error("Not implemented");
  }

  get_quantity(item: BasketItem): number {
    throw new Error("Not implemented");
  }

  calculate_total(): number {
    throw new Error("Not implemented");
  }
}

export class BasketItem {
  constructor(name: string, price: number) {
    throw new Error("Not implemented");
  }
}
