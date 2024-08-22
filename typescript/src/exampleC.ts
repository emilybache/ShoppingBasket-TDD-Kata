export class ShoppingBasket {
  getQuantity(itemName: String): number {
    throw new Error("Not implemented yet");
  }

  totalPrice(): number {
    throw new Error("Not implemented yet");
  }
}
export class Item {}

export class ShoppingBasketBuilder {
  addItem(item: Item): ShoppingBasketBuilder {
    throw new Error("Not implemented yet");
  }

  build(): ShoppingBasket {
    throw new Error("Not implemented yet");
  }
}

export class ItemBuilder {
  private name: string;

  constructor(name: string) {
    throw new Error("Not implemented yet");
  }

  withPrice(price: number): this {
    throw new Error("Not implemented yet");
  }

  withQuantity(quantity: number): this {
    throw new Error("Not implemented yet");
  }

  build(): Item {
    throw new Error("Not implemented yet");
  }
}
