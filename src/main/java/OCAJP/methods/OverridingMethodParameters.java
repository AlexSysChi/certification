package OCAJP.methods;

public class OverridingMethodParameters {
}

class A {
    void test(long l){
        System.out.println(l);
    }
}
class B extends A {
    @Override
    void test(long l) {
        super.test(l);
    }
}
