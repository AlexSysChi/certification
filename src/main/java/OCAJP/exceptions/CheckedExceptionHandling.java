package OCAJP.exceptions;

public class CheckedExceptionHandling {

    public static void main(String[] args) /*throws Exception*/ {

        //new CheckedExceptionHandling().meth();

        // above string of code won't compile because meth method declares
        // that it could throw Exception (which contains CheckedException)
        // and in this case calling method (main in our case) should either handel
        // possible exception or declare such probability in method declaration
    }

    public void meth() throws Exception {
        for (int x = 0; x > 5; x++)
            System.out.println(x);
    }
}
