package OCAJP.unreachable;

public class UnreachableStatementInsideIfElse {
    public static void main(String[] args) {
        if (true) {
            System.out.println("100% reachable statement");
        } else if(false){
            System.out.println("100% unreachable statement, but successfully compiles");
        }
    }
}
