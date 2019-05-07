package OCAJP.variable.declaration;

public class FinalLocalVariableDeclaration {
    public static void main(String[] args) {
        final int i;
        System.out.println("final int i declared, but haven't initialized yet");
        i = 1;
        System.out.println("final int initialized with value: " + i);
    }
}
