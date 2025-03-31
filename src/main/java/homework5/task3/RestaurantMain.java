package homework5.task3;

public class RestaurantMain {
    public static void main(String[] args) {
        Dish bevarage = new Bevarage();
        RestaurantManager kolya = new RestaurantManager();

        kolya.getDescription(bevarage);
        kolya.addDish(bevarage);

        Dish hotDish = new HotDish();
        kolya.getDescription(hotDish);
        kolya.addDish(hotDish);
    }
}
