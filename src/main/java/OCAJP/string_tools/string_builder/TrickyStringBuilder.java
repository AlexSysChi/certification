package OCAJP.string_tools.string_builder;

import static OCAJP.string_tools.Util.printSbDetails;

public class TrickyStringBuilder {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Java");
            printSbDetails(s); //
        s.insert(0, "The latest"); // insert value starting from 0 position
            printSbDetails(s); //
        s.append("version is");
            printSbDetails(s); //
        s.append("1.7");
            printSbDetails(s);
        s.delete(27, 28); // delete(int start , int end) end is excluded
            printSbDetails(s);
        s.append("8");
            printSbDetails(s);
        s.substring(4); // take substring starting from 4 until the end
            printSbDetails(s);
    }
}
