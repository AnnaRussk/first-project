package practice5;

public class Car extends Transport {
    public Car() {
/*      this.speed = 70; //km/h
        this.capacity = 30; //m3*/
        super(70,30);
    }

    @Override
    void start() {
        System.out.println("Машина поехала");
    }
}
