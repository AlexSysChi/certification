package OCAJP.loops;

public class UnreachableStatement {
    public static void main(String[] args) {
        String[] sts = {"A", "B", "C"};
        for (String i : sts) {
            continue;
            //System.out.print(i); // unreachable statement causes compilation fails
        }
    }
}
