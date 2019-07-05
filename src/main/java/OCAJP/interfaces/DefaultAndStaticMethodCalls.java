package OCAJP.interfaces;

interface I{
    public default void print(){
        System.out.println("I");
    }
    static void method(){
        System.out.println("Static");
    }
}

class C implements I {}

public class DefaultAndStaticMethodCalls {
    public static void main(String[] args) {
        I i = new I(){};
        i.print();
        //i.method(); // won't compile
        I.method();

        C c = new C();
        c.print();
        //c.method(); // won't compile
    }
}
