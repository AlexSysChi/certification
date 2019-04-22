package OCAJP.loops;

public class ScopeOne {
    static int x = 1;

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4,};
        for (int x : nums) {
            System.out.println(x);
            //  System.out.println(x + ScopeOne.x); // works fine
            continue;
            //System.out.println(x + ScopeOne.x); // ScopeOne.java:11: error: unreachable statement
        }
    }
}
