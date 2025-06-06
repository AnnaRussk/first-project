package practice5.task2;

public class Electronics extends Item {
    private final static int DEFAULT_GUARANTEE = 2;
    private int guarantee;

    public Electronics(String name, double price, int count) {
        super(name, price, count);
        this.guarantee = DEFAULT_GUARANTEE;
    }

    public int getGuarantee() {
        return guarantee;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(", гарантия " + this.guarantee);
    }
}
