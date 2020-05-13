package abstractFactory;

public class RestauranFractoryProducer {
    public RestaurantAbstracFactory getRestaurantAbstracFactory(int numRestaurant){
        switch (numRestaurant){
            case 1: return new Restaurant1Factory();
            case 2: return new Restaurant2Factory();
            default: return null;
        }
    }
}
