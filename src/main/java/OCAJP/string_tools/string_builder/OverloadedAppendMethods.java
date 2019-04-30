package OCAJP.string_tools.string_builder;

public class OverloadedAppendMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("A");

        sb.append(new char[] {'B', 'C'});
        sb.append(3);
        sb.append(true);
        System.out.println(sb);

        char[] chars = {'1', 'Z', '0', '-', '8', '1'};
        sb = new StringBuilder();
        sb.append(chars, 0, chars.length-1);// append(char[], int offset, int length)
        sb.append('0'); // append(char)
        sb.append("8"); // append(String)
        System.out.println(sb);
    }
}
