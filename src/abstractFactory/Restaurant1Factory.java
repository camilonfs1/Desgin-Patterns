package abstractFactory;

public class Restaurant1Factory  extends RestaurantAbstracFactory{
    @Override
    public FastFood getFastFood(String type) {
        switch (type){
            case "hamburguer": return new hamburguer();
            case "sandwich": return new Santwich();
            case "hot dog": return new HotDog();
            default: return null;
        }
    }

    @Override
    public Drink getDrink(String type) {
        switch (type){
            case "soda": return new Soda();
            default: return null;
        }
    }
}
