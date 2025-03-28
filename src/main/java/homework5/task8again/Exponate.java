package homework5.task8again;

public abstract class Exponate implements Taskable {
    final int century;

    Exponate(int century) {
        this.century = century;
    }

    public int getCentury() {
        return century;
    }

    public void tellHistory() {
        System.out.println("Тут будет рассказана история экспоната");
    }

    public void maintainance() {
        System.out.println("Этот экспонат нуждается в поддержании");
    }

    public void addToMuseum() {
        System.out.println("Как принять конкретный экспонат");
    }
}
