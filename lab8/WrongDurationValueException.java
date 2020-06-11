package lab8;

public class WrongDurationValueException extends RuntimeException{
    public WrongDurationValueException() {
//        System.out.println("Проблема в тому, що тривалість композиції <= 0");
    }

    public WrongDurationValueException(String message) {
        super(message);
    }
}
