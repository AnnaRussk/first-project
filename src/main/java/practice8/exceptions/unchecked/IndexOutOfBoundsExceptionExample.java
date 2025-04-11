package practice8.exceptions.unchecked;

public class IndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int number = numbers[5];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Попытка доступа к элементу вне массива");
        }
    }
}
