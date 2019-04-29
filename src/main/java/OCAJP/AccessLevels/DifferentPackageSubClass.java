package OCAJP.AccessLevels;

import OCAJP.AccessLevels.super_level.SuperClass;

public class DifferentPackageSubClass extends SuperClass {

    public static void main(String[] args) {
        /*

        // won't compile :

        SuperClass superClass = new SuperClass();
        System.out.println(superClass.publicInt);
        System.out.println(superClass.protectedInt);
        superClass.protectedDoer();
        superClass.publicDoer();

        // because:
        // Protected members can be accessed within [package or subclasses] only by subclass object.
        // In different package you can't access protected member by super class object

        */
    }

}
