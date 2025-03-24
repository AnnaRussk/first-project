package practice5.task1;

public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        Transport car = new Car();
        Transport ship = new Ship();
        Transport plane = new Plane();

        dispatcher.control(car);
        dispatcher.getInfo(car);

        dispatcher.control(plane);
        dispatcher.getInfo(plane);

        dispatcher.control(ship);
        dispatcher.getInfo(ship);

    }
}
