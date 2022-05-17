from example1b import from_dollars, Item, from_item_quantities


def test_total_over_100_gives_five_percent_discount():
    itemA = Item("A", from_dollars(10.0))
    itemB = Item("B", from_dollars(25.0))
    itemC = Item("C", from_dollars(9.99))
    basket = from_item_quantities(
        (itemA, 5),
        (itemB, 2),
        (itemC, 6),
    )
    assert basket.quantity("C") == 6
    assert from_dollars(151.94) == basket.total_price()
