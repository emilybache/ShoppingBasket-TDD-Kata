
class ShoppingBasket:

    def add(self, item, quantity):
        raise NotImplementedError()

    def get_quantity(self, item):
        raise NotImplementedError()

    def calculate_total(self):
        raise NotImplementedError()


class BasketItem:

    def __init__(self, name, price):
        raise NotImplementedError()
