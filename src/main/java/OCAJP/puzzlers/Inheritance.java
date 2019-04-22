package OCAJP.puzzlers;

interface Hero{
    default String m1(){return "m1";}
}

public class Inheritance implements Hero {
    public String m1(){return "m1 Over";}

    public static void main(String[] args) {
        Inheritance n = new Inheritance();
        n.go(n);
    }

    void go(Inheritance n) {
        System.out.println(n.m1());
        System.out.println(Hero.super.m1());    // call default impl of interface method
        System.out.println();
    }

}
