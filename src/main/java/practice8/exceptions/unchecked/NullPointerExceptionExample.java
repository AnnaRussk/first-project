package practice8.exceptions.unchecked;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String line = null;
            int lenght = line.length(); //это вызовет исключение, тк у нулл нет длины
        } catch (NullPointerException e) {
            System.out.println("Попытка вызова метода у null объекта");
        }
    }
}
