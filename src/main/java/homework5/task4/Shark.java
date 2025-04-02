package homework5.task4;

public class Shark extends SeaBeast {

    @Override
    protected void move() {
        System.out.println("Акула плавает быстро и агрессивно");
    }

    protected void add() {
        System.out.println("Акуле нужен транквилизатор");
    }
}
