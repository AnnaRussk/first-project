package practice5;

public class Car extends Transport {
    public Car() {
        super(70,30);
    }

    @Override
    void start() {
        System.out.println("Машина поехала");
    }
}
