package homework5.task3;

public class HotDish implements Dish {
    @Override
    public void getDescription() {
        System.out.println("Это горячее блюдо");
    }

    @Override
    public void addDish() {
        System.out.println("Добавляем горячее в меню");
    }
}
