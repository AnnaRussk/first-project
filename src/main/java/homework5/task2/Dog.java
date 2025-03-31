package homework5.task2;

public class Dog extends Pet {

    public void feed() {
        System.out.println("Собака есть сухой корм");
    }

    @Override
    protected void interact() {
        System.out.println("С собакой надо гулять");
    }
}
