package OCAJP.variable_declaration;

public class NumericTypesCasting{

    static float f = 10;    // produces: 10.0 correct even without .xxx or f postfixes
    static int i = 100;     // produces: 100
    static long l = 1;      // produces 1 even without l/L postfixes

    public static void main(String[] args) {

        long l1 = i + l;    // ok due to auto widening of int i to long
        float  f1 = f + l;  // ok due to long l = 1 could be convert to float without losses
        //int i1 = f + i;   // won't compile without implicit casting
                            // because accuracy loosing is possible

    }
}
