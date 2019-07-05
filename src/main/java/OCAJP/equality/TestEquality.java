package OCAJP.equality;

public class TestEquality {
    public static void main(String[] args) {
        //Double d = 10; // fails but double d = 10; is ok
        Double d = 10.0;
        int i = 10;
        Integer wi = 10;
        //System.out.println(wi == d); // won't compile
        System.out.println(d == i);
        System.out.println(d.equals(i));
        System.out.println(d.equals(wi));
        System.out.println(wi.equals(d));
    }
}
