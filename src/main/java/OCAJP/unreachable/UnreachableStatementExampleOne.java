package OCAJP.unreachable;

public class UnreachableStatementExampleOne {

    public static void main(String[] args) {
        String[] sts = {"A", "B", "C"};

        for (String i : sts) {
            continue;
            //System.out.println(i); // won't compile - unreachable statement
        }
    }

}
