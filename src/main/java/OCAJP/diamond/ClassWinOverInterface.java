package OCAJP.diamond;

interface I1 {
    default void test() {
        System.out.println("I1");
    }
}

interface I2 extends I1 {
    //@Override could be here
    default void test() {
        System.out.println("I2");
    }
}

class A {
    public void test() {
        System.out.println("A");
    }
}

class B extends A implements I1 {
}

class I implements I1, I2 {
}

public class ClassWinOverInterface {
    public static void main(String[] args) {
        B b = new B();
        b.test();

        I i = new I();
        i.test();
    }
}
