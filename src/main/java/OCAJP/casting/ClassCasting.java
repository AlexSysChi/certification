package OCAJP.casting;

interface I {
    void meth();
}

class A implements I {

    void A(String s) {
    }

    public void meth() {
        System.out.print("A");
    }
}

class C extends A implements I{

    public void meth() {
        System.out.print("C");
    }
}

public class ClassCasting {
    public static void main(String[] args) {

        I i1 = new A();
        I i2 = new C();

        A a1 = new A();
        A a2 = new C();
        C c;

        //c = (C) a1;
        //c = (C) a2;
        c = (C)i2;
    }
}
