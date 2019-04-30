package OCAJP.string_tools.string_builder;

public class Capacity {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); // sb initial capacity is equals to 16
        sb = new StringBuilder("1234");
        System.out.println(sb.capacity()); // sb  capacity of this sb = initial one (16)
                                           // + constructor argument length (4), equals to 20
        sb = new StringBuilder("Whiz");
        sb.append("Labs");
        sb.length(); // equals to 8
        sb.capacity(); // equals to 20
        System.out.println(sb.length() + sb.capacity()); // produces 28

        // ensure capacity example
        sb = new StringBuilder("ABCDEF");
        printSbInfo(sb);    //[sb value: ABCDEF, sb capacity: 22, sb length: 6]

        sb.delete(4, 22);   // second parameter (end) will be set to actual sb.length()
        printSbInfo(sb);    // [sb value: ABCD, sb capacity: 22, sb length: 4]

        sb.ensureCapacity(22);
        printSbInfo(sb);    // [sb value: ABCD, sb capacity: 22, sb length: 4]

        sb.ensureCapacity(23);
        printSbInfo(sb);    // [sb value: ABCD, sb capacity: 46, sb length: 4]

        /* ensureCapacity method guarantee that that capacity is at least equals to specified minimum.
            if current capacity is less than the specified argument - than new internal array is allocated
            with greater capacity.
            new capacity value is:  2*(current capacity + 1)
        */
    }

    static void printSbInfo(StringBuilder sb) {
        System.out.println("[sb value: " + sb + ", sb capacity: " + sb.capacity() + ", sb length: " + sb.length() + "]");
    }
}
