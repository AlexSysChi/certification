package OCAJP.enums;

public enum Speed { // implicitly extend java.lang.Enum so extends SomeClass here is impossible
    FAST(2),
    FASTER(3),
    SLOW(1);

    private final int speed;    // fine, because it is initialized trough parameterized constructor
                                // for each and every enum instance (i.e. declared constant)

    /*public*/ Speed(int speedCode) { // enum constructors must be either private or package-private
                                      //    it's impossible to use public or protected ones
                                      // https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
        // in short: enum declared values (i.e. instances)  created automatically, and it   is impossible
        // to call public/protected constructor and create enum instance outside the declaration enum class

        this.speed = speedCode;
    }
}
