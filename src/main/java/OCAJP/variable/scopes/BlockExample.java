package OCAJP.variable.scopes;

public class BlockExample {
    static int x = 3;

    public static void main(String[] args) {
        int x = 5;

        {
            //int x = 7; //won't compile because we already have x in the method
            int y = 9;
        }
        //System.out.println(y); // compilation fails due to y is out of scope
        System.out.println(x);
    }

}
