package OCAJP.staticEntity;

public class StaticVsInstance {

    private String name = "Static class";
    static void first(){}
    static void second(){}
    void third(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        first();
        //new StaticVsInstance().first(); // also possible
        second();
        //new StaticVsInstance().second(); // also possible
        new StaticVsInstance().third(); // works because instance is created
        //third(); // doesn't work
    }
}
