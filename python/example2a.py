class InventoryManager:
    pass


def get_quantity(all_items, basket, item_name):
    for itemN, item_quantity in basket:
        if itemN == item_name:
            return item_quantity
    return 0


def calculate_total(all_items, basket):
    all_items_dict = dict(all_items)
    total = 0
    for item_name, item_quantity in basket:
        total += all_items_dict[item_name] * item_quantity

    if total > 100:
        total = total * 0.95
    return total
