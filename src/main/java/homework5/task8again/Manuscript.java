package homework5.task8again;

public class Manuscript extends Exponate {
    Manuscript(int century) {
        super(century);
    }

    public void tellHistory() {
        System.out.println("Это ооочень древний манускрипт");
    }

    public void maintainance() {
        System.out.println("Манускрипту нужно поддерживать температуру и влажность");
    }

    public void addToMuseum() {
        System.out.println("Открыть коробку в темноте");
    }
}
