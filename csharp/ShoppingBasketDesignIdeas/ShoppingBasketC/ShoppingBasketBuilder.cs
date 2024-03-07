namespace ShoppingBasketC;

public class ShoppingBasketBuilder
{

        private ShoppingBasket _basket = new ShoppingBasket();

        public ShoppingBasketBuilder AddItem(Item item)
        {
            throw new NotImplementedException();
        }

        public ShoppingBasket Build()
        {
            return _basket;
        }
    
}