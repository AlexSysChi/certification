package OCAJP.string_tools.string;

public class IndexOfMethod {

    public static void main(String[] args) {
        String s = "0123456789";

        System.out.println(s.indexOf(48));  // 48 - is code for 0
        //System.out.println(s.indexOf('0'));

        System.out.println(s.indexOf(49,1)); // 49 - is code for 1
        //System.out.println('1');

        System.out.println(s.indexOf("23"));
        System.out.println(s.indexOf("45", 4));




    }



}
