package OCAJP.wrappers;

public class BooleanWraps {
    public static void main(String[] args) {
        // all above string_tools produce instance of Boolean with true value
        Boolean aTrue1 = Boolean.TRUE;
        Boolean aTrue2 = Boolean.valueOf("true");
        Boolean aTrue3 = new Boolean("True"); // ignoring case
    }
}
