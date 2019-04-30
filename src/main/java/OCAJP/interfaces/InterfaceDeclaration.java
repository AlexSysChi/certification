package OCAJP.interfaces;

public abstract interface InterfaceDeclaration {
        public static final int value = 15; // considered as VALUE
        public abstract  void abstractMethod();
        public static void staticMethod(){
            //some implementation
        }
        public default void defaultMethod(){
            //  some implementation
        }
}
