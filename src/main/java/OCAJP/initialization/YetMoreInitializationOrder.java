package OCAJP.initialization;

public class YetMoreInitializationOrder {
    static {add(2);}    //  1
    private static void add(int num) {System.out.print(num + " ");}
    private YetMoreInitializationOrder() {add(5);}
    static {add(4);}    //  2
    {add(6);}
    static {new YetMoreInitializationOrder();}  // 3
    {add(8);}
    public static void main(String[] args) {}
}
