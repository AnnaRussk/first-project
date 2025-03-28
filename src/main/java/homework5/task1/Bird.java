package homework5.task1;

public class Bird extends Animal {

    @Override
    public final void makeSound() {
        System.out.println("Птица чирикает");
    }

    @Override
    public final void moving() {
        System.out.println("Птица летает");
    }

    @Override
    public void add() {
        System.out.println("Добавляем птицу");
    }
}
