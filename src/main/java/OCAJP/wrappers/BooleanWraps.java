package OCAJP.wrappers;

public class BooleanWraps {
    public static void main(String[] args) {
        // all above string_tools produce instance of Boolean with true value
        final Boolean aBoolean = Boolean.TRUE;
        final Boolean aBoolean1 = Boolean.valueOf("true");
        final Boolean aBoolean2 = new Boolean("True");// ignoring case
        final boolean aBoolean3 = Boolean.parseBoolean("tRue");
        final boolean aBoolean4 = Boolean.getBoolean("sasasa");
        final boolean aBoolean5 = new Boolean(null);

        System.out.println("" + aBoolean + aBoolean1 + aBoolean2 + aBoolean3 + aBoolean4 + aBoolean5);

    }
}
