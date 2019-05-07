package OCAJP.loops;

public class UnreachableLoop {
    public static void main(String[] args) {
        String[] sts = {"A", "B", "C"};
        for (String i : sts) {
            continue;
            //System.out.print(i); // unreachable statement causes compilation fails
        }

        int i = 10;
//        while(false) {
//            i = 20;
//            System.out.println(i);
//        }

    }
}
