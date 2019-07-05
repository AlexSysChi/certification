package OCAJP.loops;

public class TrickyFor {
    public static void main(String[] args) {
        new TrickyFor().iterator(new int[]{10, 12, 13});
    }

    void iterator(int[] i) {
        for (int x = 0; x < i.length; System.out.println(i[x])) x++;
    }
}

class TestForDeclaration {
    public static void main(String[] args) {
          int[] a = {1, 2, 3, 4, 5, 6};
        for (int i = 0, j = 0; i < a.length; j++) {
            i = a[j];   // here i cursor is incremented by assign array elements
            System.out.println(i + " ");
        }
    }
}
