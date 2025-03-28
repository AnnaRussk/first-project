package homework5.task1;

public class MainZoo {

    public static void main(String[] args) {
        Animal bird = new Bird();

        ZooManager kolya = new ZooManager();

        kolya.add(bird);
    }

}
