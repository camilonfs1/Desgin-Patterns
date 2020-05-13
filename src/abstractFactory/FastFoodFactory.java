package abstractFactory;

public class FastFoodFactory extends RestaurantAbstracFactory{
    @Override
    public FastFood getFastFood(String type){
        switch (type){
            case "hamburger": return new hamburguer();
            case "santwich": return new Santwich();
            case "hot dog": return new HotDog();
            default: return null;
        }
    }

    @Override
    public Drink getDrink(String type) {
        return null;
    }
}
