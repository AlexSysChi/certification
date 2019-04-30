package OCAJP.string_tools;

public class EqualityTest {
    public static void main(String[] args) {
    //  String s = 4;// java: incompatible types: int cannot be converted to java.lang.String

        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");

        //if (s1 == s2)   //  java: incomparable types: java.lang.String and java.lang.StringBuilder
        System.out.println("1");

        if (s1.equals(s2))  //  false
        System.out.println("2");

        if (s1.contentEquals(s2))   // spec
        System.out.println("2");

    }
}
