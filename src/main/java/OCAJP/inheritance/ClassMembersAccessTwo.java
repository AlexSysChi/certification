package OCAJP.inheritance;

public class ClassMembersAccessTwo {
    final int j = 32;

    public static void main(String[] args) {
        char c = 'A'; // ASCII 'A' code is 65; 'a' code is 97
        System.out.println((char) calc(c));
    }

    private static int calc(int i) {
        //return (i + j); // FAILS: try access instance variable from static method
        return (i + new ClassMembersAccessTwo().j); //  ok
    }
}
