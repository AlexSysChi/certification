package OCAJP.inheritance;

class A {
    static void method() {
        System.out.println("A B");
    }
}

class B extends A {
    protected static void method() {
        System.out.println("C D");
    }
}

class C extends B {
    public static void method() {
        System.out.println("E F");
    }
}

public class StaticOverride {

    public static void main(String[] args) {
        A a = new B();
        a.method();

        /*



        */

        B b = new B();
        b.method();

        b = new C();
        b.method();
    }

}
