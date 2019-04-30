package OCAJP.variable.declaration;

public class PrimitiveNumericalVariableDeclaration {

    public static void main(String[] args) {

        byte b = 127;
        //b = 128'; // won't compile without explicit casting
        b = (byte) 128;

        //short s = 50_000; // too big number, explicit casting required

        //float f = 0.0; won't compile because fractional literals are double by default, F prefix required
        float f = 0.0F;
        double d = 0.0D;

        //int i = f; won't compile because of possible accuracy loosing



    }
}
