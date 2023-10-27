namespace ShoppingBasket2.Tests;

[TestFixture]
public class BasketTest
{
    [Test]
    public void Total_Over_100_Gives_Five_Percent_Discount()
    {
        var basket = new ShoppingBasket();
        basket.Add("A", new decimal(10.0), 5);
        basket.Add("B", new decimal(25.0), 2);
        basket.Add("C", new decimal(9.99), 6);
        Assert.That(basket.GetQuantity("C"), Is.EqualTo(6));
        Assert.That(basket.CalculateTotal(), Is.EqualTo(new decimal(151.94)).Within(0.01));
    }
}
