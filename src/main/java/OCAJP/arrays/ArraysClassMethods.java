package OCAJP.arrays;

import java.util.Arrays;

public class ArraysClassMethods {

    public static void main(String[] args) {
        int[] x = new int[3];
        Arrays.fill(x, 1); // fill - fill set array with specified value
        System.out.println(Arrays.toString(x));

        int[] array = {2, 5, 9, 5, 0, 3};
        Arrays.sort(array, 2, 6);
        System.out.println(array[2] + array[5]);


    }
}
