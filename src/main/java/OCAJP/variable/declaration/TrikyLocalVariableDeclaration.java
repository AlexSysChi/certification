package OCAJP.variable.declaration;

public class TrikyLocalVariableDeclaration {
    static int x = 2;
           // int x; impossible to have class and instance variable with the same names
           int y = 4;
    public static void main(String[] args) {
        if (x > 1) {    // here operate with class x variable
            x++;        // also

            int x = 4;  // declare local x variable with if-block scope
            // which shadow class variable x
            int y = 5; // shadowing instance variable y
        }
        System.out.println(x);  // here print class variable x, because local x for if-block is out of scope
        final int x = 10;       // declaration local variable for main-method-block scope. also shadow class variable x
        if (x > TrikyLocalVariableDeclaration.x) {     //  here process main-method-block scope x variable
            //int x = 1; // declaration not allowed because main-method-block scope and this if-block scopes overlap
            // and there is no opportunity to distinguish them
        }
    }
}
