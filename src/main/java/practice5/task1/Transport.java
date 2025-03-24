package practice5.task1;

public abstract class Transport {
    private final double speed;
    private final int capacity;

    Transport(double speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }
    public double getSpeed() {
        return this.speed;
    }

    public int getCapacity() {
        return this.capacity;
    }

    abstract void start();
}
