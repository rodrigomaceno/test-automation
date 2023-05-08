package classes;

public class InvalidAmountException extends Throwable {
    public InvalidAmountException(String message) {
        super(message);
    }
//    public InvalidAmountException() {
//        super("Enter a valid amount");
//    }
}
