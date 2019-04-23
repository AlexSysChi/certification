package OCAJP.strings.string;

import java.util.Arrays;

public class JoinMethod {
    public static void main(String[] args) {
        String[] strings = {"A", "B", "C"};
        System.out.println(Arrays.toString(strings));

        String joined = String.join("-", strings); // apply delimiter between supplied strings arrays
        System.out.println(joined);
    }
}
