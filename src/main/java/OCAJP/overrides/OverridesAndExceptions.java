package OCAJP.overrides;

class Animal{
    public void eat() throws Exception
    {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eats");
    }
}

public class OverridesAndExceptions {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = new Dog();
        d.eat();
        //a.eat(); // cause of compilation fail due to: unhandled Exception
                 // in overridden method that could be caught or declared
    }
}
