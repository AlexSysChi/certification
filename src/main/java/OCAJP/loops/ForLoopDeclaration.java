package OCAJP.loops;

public class ForLoopDeclaration {

    public static void main(String[] args) {
        for (int x = 0; x < 10; System.out.print(x++)); // [0..9]
//        for (int x = 0; x < 9; System.out.print(x++)); // [0..8]
//        for (int x = 0; x < 10; System.out.print(x)); //  infinite loop [0..0]
//        for (int x = 0; x++ < 9; System.out.print(x++)); //  [13579] caused by twice increment
    }
}
