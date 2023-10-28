namespace ShoppingBasket4.Tests;

using NUnit.Framework;
using System.Text.Json;

/*
 * Implement tests in this order:
 * 
 * Empty basket - basket contains no items
 * one item "A" - basket contains 1 item "A"
 * two items "A" - basket contains 2 items "A"
 * two items, "A" and "B" - basket contains 1 item "A"
 * Empty basket - total price 0
 * "A" costs $10, basket contains one "A" - total $10
 * "D" costs $160, basket contains one "D" - total $152 (5% discount)
 * "E" costs $250, basket contains one "E" - total $225 (10% discount)
 * Then remove the "Ignore" marking on the test that's here and hopefully it will pass!
 */
[TestFixture]
public class BasketTest
{
    [Test]
    [Ignore("WIP")]
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

        Assert.AreEqual(6, BasketAnalysis.Quantity("C", basket));
        Assert.AreEqual(151.94m, BasketAnalysis.CalculateTotal(basket));
    }
}