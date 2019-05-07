package OCAJP.inheritance.instance_of;

public class InstanceOfExample {
    static Animal a = new Bird();

    public static void main(String[] args) {
        System.out.println(a instanceof Fly);
    }
}

interface Fly{}
class Animal{}
class Bird extends Animal implements Fly{}