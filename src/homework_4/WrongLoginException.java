package homework_4;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super("Login " + message);
    }
}