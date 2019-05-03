package OCAJP.wrappers;

public class BooleanWraps {
    public static void main(String[] args) {
        // all above string_tools produce instance of Boolean with true value
        final Boolean aTrue = Boolean.TRUE;
        final Boolean aTrue1 = Boolean.valueOf("true");
        final Boolean aTrue2 = new Boolean("True");// ignoring case
        final boolean aTrue3 = Boolean.parseBoolean("tRue");
        final boolean aTrue4 = Boolean.getBoolean("sasasa");

        System.out.println("" + aTrue + aTrue1 + aTrue2 + aTrue3 + aTrue4);

    }
}
