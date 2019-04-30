package OCAJP.wrappers;

public class WrapperNotWidening {
    int i;

    public static void main(String[] args) {
        Float f = 1.03f;
        //new WrapperNotWidening().divide(f); // won't compile: Float can't converted to Double
        new WrapperNotWidening().divide(11d);
    }

    void divide(Double d){
        System.out.println(d/i);
    }

}
