package OCAJP.wrappers;

public class IntegerClassMethods {
    public static void main(String[] args) {

        double d = 10.7;
        Integer i = Integer.decode("-012"); // -12
        int ii = Integer.parseInt("-011"); // -11

        final Integer decode = Integer.decode("1");
        final Integer integer = Integer.valueOf(1);
        final Integer integer1 = Integer.valueOf("1");
        final Integer integer2 = Integer.valueOf("1", 1);
        final Integer integer3 = new Integer("1");
        final Integer integer4 = new Integer(1);
        final int i1 = Integer.parseInt("1");

        for (Long l = 0L; l < 5; l++ ) {
            //int[] a = new int[l];
        }

        System.out.println(ii + d + i);
    }
}
