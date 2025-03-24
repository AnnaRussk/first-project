package practice5.task2;

public class Main {
    public static void main(String[] args) {
        Item mug = new Item("Кружка", 100, 2);
        Item mic = new Electronics("Микрофон", 10000, 4);
        Item dress = new Clothes("Платье", 1000, 8);

        Manager kostya = new Manager();

        kostya.manage(mug);
        kostya.manage(dress);
        kostya.manage(mic);
    }
}
