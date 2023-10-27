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
    },
    {
      ""name"": ""B"",
      ""price"": 25.0,
    },
    {
      ""name"": ""C"",
      ""price"": 9.99,
    }
  ],
  ""quantities"": [
    {
      ""name"": ""A"",
      ""quantity"": 5
    },
    {
      ""name"": ""B"",
      ""quantity"": 2
    },
    {
      ""name"": ""C"",
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