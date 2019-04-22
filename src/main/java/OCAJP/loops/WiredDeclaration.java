package OCAJP.loops;

public class WiredDeclaration {
    public static void main(String[] args) {
        for (int x = 0, y = 6; x >y; System.out.println(x--));
        // here increment part is unreachable because condition part is false from the very beginig
        // otherwise such declaration will provide output to console
    }
}
