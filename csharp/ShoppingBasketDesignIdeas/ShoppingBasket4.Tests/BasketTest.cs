namespace ShoppingBasket4.Tests;

using NUnit.Framework;
using System.Text.Json;

[TestFixture]
public class BasketTest
{
    [Test]
    public void Total_Over_100_Gives_Five_Percent_Discount()
    {
        string json = @"
{
  ""items"": [
    {
      ""name"": ""A"",
      ""price"": 10.0,
      ""quantity"": 5
    },
    {
      ""name"": ""B"",
      ""price"": 25.0,
      ""quantity"": 2
    },
    {
      ""name"": ""C"",
      ""price"": 9.99,
      ""quantity"": 6
    }
  ]
}
";
        var basket = ShoppingBasketFactory.FromJson(json);

        Assert.That(basket.GetQuantity("C"), Is.EqualTo(6));
        Assert.That(basket.CalculateTotal(), Is.EqualTo(151.94).Within(0.01));
    }
}