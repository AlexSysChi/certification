package OCAJP.arrays;

import java.util.Arrays;

public class ArrayIndexTypeRestriction {

    static long index = 2;

    public static void main(String[] args) {
        int[][] array = {{},{1,2,3},{4,5}};
        //System.out.println(array[0][0]); produce java.lang.ArrayIndexOutOfBoundsException
        System.out.println(array[0].length);
        System.out.println(Arrays.deepToString(array));

        //System.out.println(array[index][1]); // won't compile: only int values could be used  as array index


    }

}
