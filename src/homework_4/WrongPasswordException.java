package homework_4;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
            super("Password " + message);
        }
    }