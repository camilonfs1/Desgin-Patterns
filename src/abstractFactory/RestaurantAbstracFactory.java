package abstractFactory;

public abstract class RestaurantAbstracFactory {
    abstract public FastFood getFastFood(String type);
    abstract public Drink getDrink(String type);
}
