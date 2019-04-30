package OCAJP.variable.initialization;

public class DefaultVariableInitialization {
    static int x, y = 10, z = x*y;  // compiled without error as
                                    // x has default init value equals to 0
    static Integer i;

    public static void main(String[] args) {
        System.out.println(z);

        int x = 10;
        if (x++ > 10 & i++ == 1) i+=10; // produce NPE as i has an null value


    }
}
