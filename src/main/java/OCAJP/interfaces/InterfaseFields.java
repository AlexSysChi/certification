package OCAJP.interfaces;

public class InterfaseFields {
}

//@FunctionalInterface in such case only one abstract method is allowed
interface A {
    public static final int value = 15;
    public abstract  void firstAbstractMethod();
    public abstract void secondAbstractMethod();
    public static void staticMethod(){
        //some implementation
    }
    public default void defaultMethod(){
        //  some implementation
    }
}
