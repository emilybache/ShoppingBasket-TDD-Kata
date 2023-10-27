using ShoppingBasket2.Tests;

namespace ShoppingBasket2;

public class ShoppingBasket
{
    public void Add(string name, Dictionary<string, object> itemProperties)
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

    public Dictionary<string, Dictionary<string, object>> Items { get; set; }
}

