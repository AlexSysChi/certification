package OCAJP.inheritance;



public class PolymorphicVariableCall {
    public static void main(String[] args) {
        Baap b = new Beta();
        System.out.println(b.h + " " + b.getH());
        //Beta bb = (Beta) b;
        //System.out.println(bb.h);
        //System.out.println(bb.getH());
        //System.out.println(bb.h + " " + bb.getH());
    }
}


class Baap {
    public int h = 4;
    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
}


class Beta extends Baap {
    public int h = 44;

    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }
}
