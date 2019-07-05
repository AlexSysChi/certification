package OCAJP.controls;

public class TrickyIfDeclaration {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3};
        if (arr.length == 0)
            System.out.println("==0");
            System.out.println(arr.length);
            //else // id uncomment this else compilation will fail because
                   // without braces if include only single statement

                if (arr.length > 0)
            System.out.println(">0");
            else
            System.out.println("?");

            boolean b;

            if (b = 3 > arr[0]++ ) {
                System.out.println(b);
            }
    }
}
