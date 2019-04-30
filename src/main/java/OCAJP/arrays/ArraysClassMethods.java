package OCAJP.arrays;

import java.util.Arrays;

public class ArraysClassMethods {

    public static void main(String[] args) {
        int[] x = new int[3];
        Arrays.fill(x, 1); // fill - fill set array with specified value
        System.out.println(Arrays.toString(x));
    }

}
