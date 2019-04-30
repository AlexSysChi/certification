package OCAJP.string_tools;

public class Util {

    public static void printSbDetails(StringBuilder sb) {
        System.out.println("[" + sb
                + "], length: " + sb.length()
                + ", capacity: " + sb.capacity()
        );

    }

}
