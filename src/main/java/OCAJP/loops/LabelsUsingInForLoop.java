package OCAJP.loops;

public class LabelsUsingInForLoop {
    public static void main(String[] args) {
        L1:
        for (int i = 5, j = 0; i > 0; i--) {
            L2:
            for (; j < 5; j++) {
                System.out.print(i + "" + j + " ");
                if (j == 0) continue L1;
            }
        }
    }
}
