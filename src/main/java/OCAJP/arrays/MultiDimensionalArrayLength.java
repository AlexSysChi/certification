package OCAJP.arrays;

import java.util.Arrays;

public class MultiDimensionalArrayLength {

    public static void main(String[] args) {
        int[][][] array = {{{1}, {2}, {3}}, {{5}, {6}} ,{}};
        System.out.println(array.length); // returns 'first' array dimension

        int[][] arr = new int[2][];
        System.out.println(Arrays.deepToString(arr));


    }
}
