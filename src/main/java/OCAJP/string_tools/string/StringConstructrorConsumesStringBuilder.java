package OCAJP.string_tools.string;

public class StringConstructrorConsumesStringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ab");
        sb.append("cd");
        String str = new String(sb);
        String concat = str.concat("ef");// equal to
        System.out.println(concat);
    }


}
