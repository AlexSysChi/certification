package OCAJP.string_tools.string;

public class CopyValueOfMethod {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};
        String out = String.copyValueOf(chars, 1, 4);   // here offset - first character index
                                                                    // count - length of subarray, NOT exclusive src array element index
        System.out.println(out);
    }
}
