package abstractFactory;

public class Main {
    public static void main(String[] args) {
        RestauranFractoryProducer restaurantFactoryProducer = new RestauranFractoryProducer();
        RestaurantAbstracFactory restaurantAbstractFactory1 = restaurantFactoryProducer.getRestaurantAbstracFactory(1);

        System.out.println(restaurantAbstractFactory1.getFastFood("hamburguer"));
        System.out.println(restaurantAbstractFactory1.getFastFood("sandwich"));
        System.out.println(restaurantAbstractFactory1.getFastFood("hot dog"));
        System.out.println(restaurantAbstractFactory1.getDrink("soda"));

        RestaurantAbstracFactory restaurantAbstractFactory2 = restaurantFactoryProducer.getRestaurantAbstracFactory(2);
        System.out.println(restaurantAbstractFactory2);
        System.out.println(restaurantAbstractFactory2.getFastFood("pizza"));
        System.out.println(restaurantAbstractFactory2.getDrink("juice"));
        System.out.println(restaurantAbstractFactory2.getDrink("beer"));
    }
}
