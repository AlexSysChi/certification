package OCAJP.variable.initialization;

public class DefaultVariableInitialization {
    static int x, y = 10, z = x*y;  // compiled without error as
                                    // x has default init value equals to 0

    public static void main(String[] args) {
        System.out.println(z);
    }
}
