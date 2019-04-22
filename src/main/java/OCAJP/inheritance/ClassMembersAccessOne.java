package OCAJP.inheritance;

class OneClass {
    protected int x = 10;
    static int j = 21;
}

class Two extends OneClass {
}

public class ClassMembersAccessOne {
    public static void main(String[] args) {
        OneClass oneClass = new Two();
        System.out.println(oneClass.x);  // ok
        System.out.println(Two.j);  //  ok
        System.out.println(oneClass.j);  //  not good, because access class variable through instance reference, but works
        //System.out.println(OneClass.x);  // FAILS, because try to access instance variable through class bame
        System.out.println(OneClass.j);  //  ok
    }
}

