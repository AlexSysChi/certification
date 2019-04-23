package OCAJP.wrappers;

public class LongClassMethods {
    public static void main(String[] args) {
        Long l1 = 10L;
        Long l2 = 9L;
        System.out.println(Long.remainderUnsigned(l1, l2) +
                Long.remainderUnsigned(l1, l2));
    }
}
