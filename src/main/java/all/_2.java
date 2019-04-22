package all;

public class _2 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";

        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");

        System.out.println(s1 == s2); // true: as they are the same object in the String pool
        System.out.println(s1.equals(s2)); // true: equal objects
        System.out.println(sb1.toString() == s1); // false: as sb1.toString() isn't in the String pool
        //System.out.println(sb1.toString().intern() == s1); // true: as sb1.toString() is in String pool
        System.out.println(sb1.toString().equals(s1)); // true: equals objects
    }
}
