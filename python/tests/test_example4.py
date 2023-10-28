import pytest

from example4 import find_quantity, get_price

def test_total_over_100_gives_five_percent_discount():
    basket = {
        "A": {"quantity": 5, "price" : 10},
        "B": {"quantity": 2, "price" : 25},
        "C": {"quantity": 6, "price" : 9.99},
    }
    assert find_quantity(basket, "C") == 6
    assert get_price(basket) == pytest.approx(151.94, 0.01)
