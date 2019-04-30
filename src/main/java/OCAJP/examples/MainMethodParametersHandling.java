package OCAJP.examples;

public class MainMethodParametersHandling {
    public static void main(String[] args) {
        //int x = (int) args[0]; // won't compile String couldn't be casted to int
        //System.out.println(x);
        System.out.println(args.length);
    }

}
