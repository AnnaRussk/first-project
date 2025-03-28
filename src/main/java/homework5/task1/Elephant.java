package homework5.task1;

public class Elephant extends Animal {

    @Override
    public final void makeSound() {
        System.out.println("Слон трубит");
    }

    @Override
    public final void moving() {
        System.out.println("Слон топает");
    }

    @Override
    public void add() {
        System.out.println("Добавляем слона");
    }


}
