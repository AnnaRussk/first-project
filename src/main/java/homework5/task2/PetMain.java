package homework5.task2;

public class PetMain {

    public static void main(String[] args) {
        Pet cat = new Cat();
        Pet dog = new Dog();
        PetManager kolya = new PetManager();

        kolya.feedPet(cat);
        kolya.interactPet(dog);
    }
}
