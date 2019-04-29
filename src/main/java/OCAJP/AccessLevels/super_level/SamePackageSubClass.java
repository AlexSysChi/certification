package OCAJP.AccessLevels.super_level;

public class SamePackageSubClass {

    public static void main(String[] args) {

        SuperClass superClass = new SuperClass();
        System.out.println(superClass.publicInt);
        System.out.println(superClass.protectedInt);
        superClass.protectedDoer();
        superClass.publicDoer();




    }

}
