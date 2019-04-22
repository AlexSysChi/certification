package OCAJP.inner_classes;

public class TestInnerClassFieldsAccessibility {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.new Inner();
    }
}


class  Outer {
    private int outerInt = 7;
    {
        System.out.println("Outer:\n\touterInt: " + outerInt
                + "\n\tinnerInt: " + new Inner().innerInt);
    }

    class Inner{
        private int innerInt = 9;
//        {
//            System.out.println("Inner:\n" + "\tinnerInt: " + innerInt + "\n\touterInt: " + outerInt);
//        }
    }
}
