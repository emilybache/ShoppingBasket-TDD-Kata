import pytest

from example1a import ShoppingBasket, BasketItem


def test_total_over_100_gives_five_percent_discount():
    basket = ShoppingBasket()
    itemA = BasketItem("A", 10)
    itemB = BasketItem("B", 25)
    itemC = BasketItem("C", 9.99)
    basket.add(itemA, 5)
    basket.add(itemB, 2)
    basket.add(itemC, 6)
    assert basket.get_quantity(itemC) == 6
    assert basket.calculate_total() == pytest.approx(151.94, 0.01)

