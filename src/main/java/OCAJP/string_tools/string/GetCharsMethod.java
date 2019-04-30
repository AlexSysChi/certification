package OCAJP.string_tools.string;


import java.util.Arrays;

public class GetCharsMethod {
    public static void main(String[] args) {
        char[] chars = new char[4];
        chars[0] = 0;
        chars[1] = 2;
        printCharArray(chars); // will print characters which correspond to set codes

        String out = "123456789";
        out.getChars(0, 3, chars , 0);
        printCharArray(chars); // will print characters from out string
    }

    static void printCharArray(char[] chars){
        System.out.println(Arrays.toString(chars));
    }
}
