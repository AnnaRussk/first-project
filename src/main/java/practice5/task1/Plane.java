package practice5.task1;

public class Plane extends Transport {
    public Plane() {
        super(900, 10000);
    }


    @Override
    public void start() {
        System.out.println("Самолет полетел");
    }
}
