package OCAJP.interfaces;

public abstract interface Movable {
    public static final int location = 0;
    public abstract void move(int by);
    void moveBack(int by);

    public default void defMethod(){
        System.out.println("default interface method");
    };
    public static void staticMethod() {
        System.out.println("static interface method");
    };
}
