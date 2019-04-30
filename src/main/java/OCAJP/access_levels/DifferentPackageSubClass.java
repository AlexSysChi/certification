package OCAJP.access_levels;

import OCAJP.access_levels.super_level.SuperClass;

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
        // Protected members of the class can be accessed within another package only by subclass object
        //  i.e. only through inheritance, not through direct instantiation of such class
        // (it's only possible in similar package)
        // In different package you can't access protected member by super class object

        */
    }

}
