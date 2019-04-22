package OCAJP.inheritance;

class Animal{
    void run(){
        System.out.println("Animal run");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
    public void run(){
        System.out.println("Dog runs");
    }
}

public class SubClassMethodCallThrougthSuperClassRef {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.run();
        ((Dog)dog).sound();    // dog.sound() won't work
    }
}
