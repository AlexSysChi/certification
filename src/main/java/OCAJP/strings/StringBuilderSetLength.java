package OCAJP.strings;

public class StringBuilderSetLength {
    public static void main(String[] args) {

        char[] chars = {'1', 'Z', '0', '-', '8', '1'};
        StringBuilder sb = new StringBuilder();

        sb.append(chars, 0, chars.length - 1);
        System.out.println(sb);

        sb.append("08");
        System.out.println(sb);

        sb.setLength(4);
        System.out.println(sb);

        //sb.insert(5, "10"); // FAILS due to  there is no 5 index in sb
                                     // java.lang.StringIndexOutOfBoundsException: offset 5,length 4
        sb.insert(4, "10"); // works fine
        System.out.println(sb);

    }
}
