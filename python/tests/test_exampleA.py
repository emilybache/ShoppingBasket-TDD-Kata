import pytest

from exampleA import ShoppingBasket, BasketItem


@pytest.mark.skip(reason="Not implemented yet")
def test_total_over_100_gives_five_percent_discount():
    basket = ShoppingBasket()
    item_a = BasketItem("A", 10)
    item_b = BasketItem("B", 25)
    item_c = BasketItem("C", 9.99)
    basket.add(item_a, 5)
    basket.add(item_b, 2)
    basket.add(item_c, 6)
    assert basket.get_quantity(item_c) == 6
    assert basket.calculate_total() == pytest.approx(151.94, 0.01)

