package OCAJP.wrappers;

public class IntegerClassMethods {
    public static void main(String[] args) {

        Double d = 10.7;
        Integer i = Integer.decode("-012"); // -12
        Integer ii = Integer.parseInt("-011"); // -11

        i = Integer.decode("1");
        i = Integer.valueOf(1);
        i = Integer.valueOf("1");
        i = Integer.valueOf("1", 1);
        i = new Integer("1");
        i = new Integer(1);





        System.out.println(ii + d + i);
    }
}
