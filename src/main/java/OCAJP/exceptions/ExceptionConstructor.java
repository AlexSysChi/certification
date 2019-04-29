package OCAJP.exceptions;

public class ExceptionConstructor {
    public static void main(String[] args) {

    }
}

class MyException extends Exception {

    MyException() { // np parameter constructor
        super();
    }

    MyException(String message) {
        super(message);
    }

    MyException(Throwable cause) {

        new Exception(cause);
    }

    MyException(String message,
                Throwable cause) {
        super(message, cause);
    }

    MyException(String message,
                Throwable cause,
                boolean enableSuppression,
                boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);

    }
}
