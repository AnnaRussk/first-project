package practice8.library;

import practice8.library.exceptions.BookNotFoundException;
import practice8.library.exceptions.InvalidBookException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    //add book
    //corner case - if we try to add book than we have
    //we will get unchecked exception InvalidBookException
    public void addBook(Book book) throws InvalidBookException {
        if (books.contains(book)) {
            throw new InvalidBookException("Такая книга уже существует в библиотеке");
        } else {
            books.add(book);
        }
    }

    //search  book
    //corner case - if we cannot find the book
    //we will get checked exception BookNotFoundException
    public Book findBook(String name) throws BookNotFoundException {
        AtomicReference<Book> foundBook = new AtomicReference<>();
        books.forEach(book -> {
            if (book.getName().equals(name)) {
                foundBook.set(book);
            }
        });

        if (foundBook.get() == null) {
            throw new BookNotFoundException("Не нашли книгу с таким названием: " + name);
        } return foundBook.get();
    }
}
