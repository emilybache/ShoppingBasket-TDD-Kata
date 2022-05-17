import pytest

from example2a import get_quantity, calculate_total


def test_total_over_100_gives_five_percent_discount():
    itemA = ("A", 10.0)
    itemB = ("B", 25.0)
    itemC = ("C", 9.99)
    all_items = [itemA, itemB, itemC]
    basket = [
        ("A", 5),
        ("B", 2),
        ("C", 6)
    ]
    assert get_quantity(all_items, basket, "C") == 6
    assert calculate_total(all_items, basket) == pytest.approx(151.94, 0.01)
