import pytest

from exampleC import *


@pytest.mark.skip(reason="Not implemented yet")
def test_total_over_100_gives_five_percent_discount():
    basket = ShoppingBasketBuilder()\
        .add_item( ItemBuilder("A").with_price(10).with_quantity(5).build())\
        .add_item( ItemBuilder("B").with_price(25).with_quantity(2).build())\
        .add_item( ItemBuilder("C").with_price(9.99).with_quantity(6).build())\
        .build()

    assert basket.get_quantity("C") == 6
    assert basket.calculate_total() == pytest.approx(151.94, 0.01)
