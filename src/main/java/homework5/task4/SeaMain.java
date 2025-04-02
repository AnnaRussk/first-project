package homework5.task4;

public class SeaMain {

    public static void main(String[] args) {
        SeaBeast shark = new Shark();
        SeaBeast starfish = new Starfish();

        SeaCreature kolya = new SeaCreature();

        kolya.add(shark);
        kolya.move(starfish);
    }


}
