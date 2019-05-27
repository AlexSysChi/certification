package OCAJP.string_tools.string_builder;

import static OCAJP.string_tools.Util.printSbDetails;

public class SetLengthMethod {
    public static void main(String[] args) {

        char[] chars = {'1', 'Z', '0', '-', '8', '1'};
        StringBuilder sb = new StringBuilder();
        printSbDetails(sb);
        //sb.insert(1, "+");
        printSbDetails(sb);

        sb.append(chars, 0, chars.length - 1);
        printSbDetails(sb);

        sb.append("08");
        printSbDetails(sb);

        sb.setLength(4);
        printSbDetails(sb);

        //sb.insert(5, "10"); // FAILS due to  there is no 5 index in sb
                                     // java.lang.StringIndexOutOfBoundsException: offset 5,length 4
        sb.insert(4, "10"); // works fine
        printSbDetails(sb);

    }
}
