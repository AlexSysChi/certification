package OCAJP.strings;

public class StringBuilderCapasity {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("1Z0");

        //sb.append(null);//Compile Error:(6, 11) java: reference to append is ambiguous
                          //  both method append(java.lang.CharSequence)
                          // in java.lang.StringBuilder and method append(char[])
                          // in java.lang.StringBuilder match
        //sb.append((char[]) null);   //  runtime error: ava.lang.NullPointerException
        sb.append("-808");
        System.out.print(sb.length() + " ");
        System.out.print(sb.capacity());

    }
}
