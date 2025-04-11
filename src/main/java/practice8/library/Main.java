package practice8.library;

import practice8.library.exceptions.BookNotFoundException;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

/*        lib.addBook(new Book("1994", "Oruell"));
        lib.addBook(new Book("Onegin", "Pushkin"));
        lib.addBook(new Book("Onegin", "Pushkin"));*/

        try {
            lib.findBook("344");
        } catch (BookNotFoundException e) {
            throw new RuntimeException("Поймали исключение");
        }
    }
}
