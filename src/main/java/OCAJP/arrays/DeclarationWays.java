package OCAJP.arrays;

public class DeclarationWays {
    public static void main(String[] args) {

        int[] array = {1, 2, 3}; // such initialization is only possible in declaration line
        array = new int[]{1, 2, 3 ,4};
        array = new int[5];
        //array = new int[5L]; // only int allowed
    }
}
