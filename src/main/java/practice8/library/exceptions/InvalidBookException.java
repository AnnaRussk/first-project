package practice8.library.exceptions;

//unchecked -> Error OR RuntimeException
public class InvalidBookException extends RuntimeException {
    public InvalidBookException(String message) {
        super(message);
    }
}
