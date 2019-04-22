package OCAJP.loops;

public class LabelUsingInForeachLoop {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5}, {7, 8}};
        out:
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }
        }
    }
}
