package OCAJP.tricks;

public class TrickyDeclaration {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 10) {} // i = 11;
        String out = i > 10 ? ">" : "<"; // out = ">"
        System.out.println("10" + out + i);
    }
}
