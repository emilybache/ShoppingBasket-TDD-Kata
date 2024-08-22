export class ShoppingBasket {

  getQuantity(name: string): number {
    throw new Error("Not implemented yet");
  }

  calculateTotal(): number {
    throw new Error("Not implemented yet");
  }
}

export class ShoppingBasketFactory {
  static fromJson(json: string): ShoppingBasket {
    throw new Error("Not implemented yet");
  }
}
