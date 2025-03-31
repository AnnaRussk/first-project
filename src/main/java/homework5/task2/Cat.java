package homework5.task2;

public class Cat extends Pet {
    @Override
    public void feed() {
        System.out.println("Кот ест влажный корм");
    }

    @Override
    protected void interact() {
        System.out.println("С котом надо играть");
    }
}
