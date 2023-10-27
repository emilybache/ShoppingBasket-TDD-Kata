namespace ShoppingBasket3.Tests;

[TestFixture]
public class BasketTest
{
    [Test]
    public void Total_Over_100_Gives_Five_Percent_Discount()
    {
        var basket = new ShoppingBasketBuilder()
            .AddItem(new ItemBuilder("A").WithPrice(new decimal(10.0)).WithQuantity(5).Build())
            .AddItem(new ItemBuilder("B").WithPrice(new decimal(25.0)).WithQuantity(2).Build())
            .AddItem(new ItemBuilder("C").WithPrice(new decimal(9.99)).WithQuantity(6).Build())
            .Build();

        Assert.That(basket.GetQuantity("C"), Is.EqualTo(6));
        Assert.That(basket.CalculateTotal(), Is.EqualTo(new decimal(151.94)).Within(0.01));
    }
}