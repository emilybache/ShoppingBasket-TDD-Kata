using ShoppingBasket2.Tests;

namespace ShoppingBasket2;

public class ShoppingBasket
{
    public void Add(string name, Dictionary<object, object> itemProperties, decimal price, int quantity)
    {
        throw new NotImplementedException();
    }

    public int GetQuantity(string name)
    {
        throw new NotImplementedException();
    }

    public decimal CalculateTotal()
    {
        throw new NotImplementedException();
    }

    public Dictionary<string, BasketItem> Items { get; set; }
}

public class BasketItem
{
    public decimal Quantity { get; private set; }
}