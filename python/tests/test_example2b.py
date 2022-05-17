from example2b import Item, from_dollars, get_quantity, calculate_total


def test_total_over_100_gives_five_percent_discount():
    basket = {
        Item("A", from_dollars(10.0)): 5,
        Item("B", from_dollars(25.0)): 2,
        Item("C", from_dollars(9.99)): 6,
    }
    assert get_quantity(basket, "C") == 6
    assert calculate_total(basket) == from_dollars(151.94)