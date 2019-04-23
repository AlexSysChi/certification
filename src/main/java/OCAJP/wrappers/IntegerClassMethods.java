package OCAJP.wrappers;

public class IntegerClassMethods {
    public static void main(String[] args) {

        Double d = 10.7;
        Integer i = Integer.decode("-012"); // -12
        Integer ii = Integer.parseInt("-011"); // -11

        System.out.println(ii + d + i);
    }
}
