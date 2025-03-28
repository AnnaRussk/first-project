package homework5.task8again;

public class Sculpture extends Exponate {
    Sculpture(int century) {
        super(century);
    }

    public void tellHistory() {
        System.out.println("Это современная скульптура");
    }

    public void maintainance() {
        System.out.println("Скульптуру надо реставрировать");
    }

    public void addToMuseum() {
        System.out.println("Скульптуру надо аккуратно заносить");
    }
}
