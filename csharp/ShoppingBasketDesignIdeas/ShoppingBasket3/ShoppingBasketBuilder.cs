namespace ShoppingBasket3;

public class ShoppingBasketBuilder
{

        private ShoppingBasket _basket = new ShoppingBasket();

        public ShoppingBasketBuilder AddItem(string name, decimal price, int quantity)
        {
            _basket.AddItem(name, price, quantity);
            return this;
        }

        public ShoppingBasketBuilder RemoveItem(string item)
        {
            _basket.RemoveItem(item);
            return this;
        }

        public ShoppingBasket Build()
        {
            return _basket;
        }
    
}