package OCAJP.arrays;

import java.util.Arrays;

public class ArraysClassMethods {

    public static void main(String[] args) {
        int[] x = new int[3];
        Arrays.fill(x, 1); // fill - fill set array with specified value
        System.out.println(Arrays.toString(x));

        Integer[] arrayOne = {2, 5, 9, 5, 0, 3};
        Integer[] arrayTwo = {2, 5, 9, 5, 0, 3};

        boolean equal = Arrays.equals(arrayOne, arrayTwo);
        boolean equal2 = Arrays.deepEquals(arrayOne, arrayTwo);


        final Integer[][] a1 = {arrayOne};
        //final int length = a1.length;
        final Integer[][] a2 = {arrayTwo};

        final boolean equals = Arrays.equals(a1, a2);
        //boolean equal2 = Arrays.deepEquals(a1, a2);

        Arrays.sort(arrayOne, 2, 6);
        System.out.println(arrayOne[2] + arrayOne[5]);


    }
}
