package OCAJP.switchTest;

public class SwitchOne {
    public static void main(String[] args) {

        final int x = 0;
        final int y = 2;
        Integer i = Integer.valueOf(x);
//        final Integer iCase = new Integer(5);

        switch (i) {
            //case x + 1:
            //case x + 2:
            case x - 1:
                System.out.println("A");
            case 1:
                System.out.println("B");
            default:
                System.out.println("default");
                break;
            case y:
                System.out.println("C");
//            case iCase:
//                System.out.println("D");

        }
    }
}

