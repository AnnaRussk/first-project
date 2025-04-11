package practice8.library.exceptions;

//checked -> Exception (or child-classes)
public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}
