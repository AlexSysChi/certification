package OCAJP.wrappers;

public class WrapperCollaboration {
    public static void main(String[] args) {
        Double d = 10.0;
        Integer i = 10;
        //System.out.println((d+i) instanceof Object );

        // above commented code will not compile because sum of two
        // wrapper objects produces a primitive double.
        // as consequence below code won't compile also

        //System.out.println((d+i).intValue());
    }
}
