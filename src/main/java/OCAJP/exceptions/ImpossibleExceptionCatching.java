package OCAJP.exceptions;

import java.io.IOException;

public class ImpossibleExceptionCatching {
    static int i;

    public static void main(String[] args) {
        print();
    }

    public static void print() {
        try{
            System.out.println(++i);
        }
        /*
        catch (IOException ioe) { // compilation fails because of there isn't source of it in guarded region
            System.out.println("error");
        }
        */
        finally {
            System.out.println("relax");
        }
    }
}
