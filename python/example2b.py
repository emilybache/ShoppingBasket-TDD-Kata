import math


class Item:

    def __init__(self, name, price):
        self.name = name
        self.price = price


def from_dollars(amount):
    return amount*100


def get_quantity(basket, item_name):
    for item, item_quantity in basket.items():
        if item.name == item_name:
            return item_quantity
    return 0


def calculate_total(basket):
    total = 0
    for item, item_quantity in basket.items():
        total += item.price * item_quantity

    if total > 100:
        total = total * 0.95
    return math.floor(total)
