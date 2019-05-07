package OCAJP.loops;

public class TrickyFor {
    public static void main(String[] args) {
        new TrickyFor().iterator(new int[]{10, 12, 13});
    }

    void iterator(int[] i) {
        for (int x = 0; x < i.length; System.out.println(i[x])) x++;
    }
}
