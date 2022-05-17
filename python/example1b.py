import math


def from_dollars(amount):
    return amount*100


class Item:

    def __init__(self, name, price):
        self.name = name
        self.price = price


class ShoppingBasket:
    def __init__(self):
        self.items = {}

    def add_item_quantity(self, item, quantity):
        self.items[item.name] = (item, quantity)

    def quantity(self, itemName):
        if itemName in self.items.keys():
            item, quantity = self.items[itemName]
            return quantity
        return None

    def total_price(self):
        total = 0
        for (item, quantity) in self.items.values():
            total += item.price * quantity

        if total > 100:
            total = total * 0.95
        return math.floor(total)


def from_item_quantities(*items):
    basket = ShoppingBasket()
    for (item, quantity) in items:
        basket.add_item_quantity(item, quantity)
    return basket
