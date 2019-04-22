package OCAJP.loops;

public class TrickyDoWhile {
    public static void main(String[] args) {
        int x = 0;
        do {
            System.out.println(x);
        } while (x++ > 0); // PAY ATTENTION to > sign in condition
    }
    // output: [0], not [0, 1]
}
