//interface HasTail { int getTailLength(); }
//abstract class Puma implements HasTail {
//    protected int getTailLength() {return 4;} //  attempting to assign weaker access privileges; was public
//}
//public class Cougar extends Puma {  //  attempting to assign weaker access privileges; was public
//    public static void main(String[] args) {
//        Puma puma = new Puma();  // Puma is abstract; cannot be instantiated
//        System.out.println(puma.getTailLength());
//    }
//
//    public int getTailLength(int length) {return 2;}
//}
