import pytest

from exampleD import from_json


@pytest.mark.skip(reason="Not implemented yet")
def test_total_over_100_gives_five_percent_discount():
    json = """\
{
    "items": [
        {"name": "A", "price": 10.0, "quantity": 5},
        {"name": "B", "price": 25.0, "quantity": 2},
        {"name": "C", "price": 9.99, "quantity": 6}
    ]
}"""
    basket = from_json(json)

    assert basket.get_quantity("C") == 6
    assert basket.calculate_total() == pytest.approx(151.94, 0.01)
