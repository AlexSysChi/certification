package OCAJP.interfaces;

public class TestInterfaceImpl {
    public static void main(String[] args) {
        Movable m = new Donkey();
        m.move(10);
        m.moveBack(20);
        System.out.println(((Donkey) m).location);
        System.out.println(m.location);
    }
}
