import pytest

from exampleB import find_quantity, calculate_total


@pytest.mark.skip(reason="Not implemented yet")
def test_total_over_100_gives_five_percent_discount():
    basket = {
        "A": {"quantity": 5, "price" : 10},
        "B": {"quantity": 2, "price" : 25},
        "C": {"quantity": 6, "price" : 9.99},
    }
    assert find_quantity(basket, "C") == 6
    assert calculate_total(basket) == pytest.approx(151.94, 0.01)
