using NUnit.Framework;
using Assert = NUnit.Framework.Assert;

namespace ShoppingBasket1;

[TestFixture]
public class BasketTest
{
    [Test]
    public void Total_Over_100_Gives_Five_Percent_Discount()
    {
        var basket = new ShoppingBasket();
        var itemA = new BasketItem("A", 10);
        var itemB = new BasketItem("B", 25);
        var itemC = new BasketItem("C", 9.99);
        basket.Add(itemA, 5);
        basket.Add(itemB, 2);
        basket.Add(itemC, 6);
        Assert.That(basket.GetQuantity(itemC), Is.EqualTo(6));
        Assert.That(basket.CalculateTotal(), Is.EqualTo(151.94).Within(0.01));
    }
}