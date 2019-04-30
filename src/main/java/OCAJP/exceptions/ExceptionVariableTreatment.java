package OCAJP.exceptions;

public class ExceptionVariableTreatment {

    public static void main(String[] args) {
        try {
            System.out.println(args[0]);
        } catch (ArrayIndexOutOfBoundsException
        | ArithmeticException | NullPointerException e) {
            //e = new RuntimeException(); // won't compile because e variable
            // is implicitly final and can't be reassigned
        }
    }

}
