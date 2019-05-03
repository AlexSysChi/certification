package OCAJP.variable.initialization;

public class UninitLocalVariate {

    int j = 10;

    public static void main(String[] args) {
        int j;
        if (new UninitLocalVariate().go(10)) j = 5;
        //System.out.println(j);
    }

    boolean go(int y) {
        if (y > 5) return true;
        else return false;
    }


}
