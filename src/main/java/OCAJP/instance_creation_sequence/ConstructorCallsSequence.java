package OCAJP.instance_creation_sequence;

abstract class A {
    A() {
        System.out.print("1");
    }
    abstract void print();
}

class B extends A {
    B() {
        System.out.print("2");
    }
    @Override
    void print() {
        System.out.print("3");
    }
}

public class ConstructorCallsSequence {
    public static void main(String[] args) {
        new B().print();
    }
}




