package OCAJP.string_tools.string;

public class LastIndexOfMethod {
    public static void main(String[] args) {

        String out = "Oracle certified professional java programmer";
        int x = out.indexOf("O", 0);
        int y = out.lastIndexOf("pro"); // equals to out.lastIndexOf("pro", out.length())
        int z = out.lastIndexOf("e", 15);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
