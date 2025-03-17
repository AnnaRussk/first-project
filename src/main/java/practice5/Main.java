package practice5;

public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        Transport car = new Car();
        Transport ship = new Ship();
        Transport plane = new Plane();

        dispatcher.control(car);
        dispatcher.getInfo(plane);

    }
}
