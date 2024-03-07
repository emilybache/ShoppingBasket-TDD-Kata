

class ShoppingBasketBuilder:

    def add_item(self, item):
        raise NotImplementedError()

    def build(self):
        raise NotImplementedError()


class ItemBuilder:
    def __init__(self, name):
        raise NotImplementedError()

    def with_price(self, price):
        raise NotImplementedError()

    def with_quantity(self, quantity):
        raise NotImplementedError()

    def build(self):
        raise NotImplementedError()
