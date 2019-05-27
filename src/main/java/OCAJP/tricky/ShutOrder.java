package OCAJP.tricky;

class Test {
    int i = 10;
    public int getI() {
        System.out.println("from getI(): " + i++);
        return i;
    }
}

public class ShutOrder {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.i + " " +  test.getI());
    }
}
