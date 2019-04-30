package OCAJP.instance_creation_sequence;

abstract class Person{
    protected String name;
    public Person(String s) {
        this.name = s;
    }
    public abstract String getName();
}

class Student extends Person { // won't compile
    // until appropriate constructor willbe provided
    // to see problem - comment below constructor

    public Student(String s) {
        super(s);
    }

    @Override
    public String getName() {
        return name;
    }
}

public class SuperClassConstructorCallRules {
}
