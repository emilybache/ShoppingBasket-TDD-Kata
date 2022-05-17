
class ShoppingBasket:

    def __init__(self):
        self.items = {}

    def add(self, item, quantity):
        self.items[item.name] = (item, quantity)

    def get_quantity(self, item):
        if item.name in self.items.keys():
            item, quantity = self.items[item.name]
            return quantity
        return None

    def calculate_total(self):
        total = 0
        for (item, quantity) in self.items.values():
            total += item.price * quantity

        if total > 100:
            total = total * 0.95
        return total


class BasketItem:

    def __init__(self, name, price):
        self.name = name
        self.price = price
