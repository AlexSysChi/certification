package OCAJP.string_tools.string_builder;

public class DeleteMethodTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Whiz");
        System.out.println("sb value: " + sb + ", sb capacity: " + sb.capacity() + ", sb.length: " + sb.length());
        sb.delete(2, 5);
        System.out.println("sb value: " + sb + ", sb capacity: " + sb.capacity() + ", sb.length: " + sb.length());
    }
}
