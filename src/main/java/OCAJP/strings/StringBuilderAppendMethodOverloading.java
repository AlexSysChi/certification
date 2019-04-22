package OCAJP.strings;

public class StringBuilderAppendMethodOverloading {
    public static void main(String[] args) {
        char[] chars = {'1', 'Z', '0', '-', '8', '1'};
        StringBuilder sb = new StringBuilder();
        sb.append(chars, 0, chars.length-1);// append(char[], int offset, int length)
                                                     // for getting WHOLE array len should be specified as chars.length
        sb.append('0'); // append(char)
        sb.append("8"); // append(String)

        System.out.println(sb);
    }
}
