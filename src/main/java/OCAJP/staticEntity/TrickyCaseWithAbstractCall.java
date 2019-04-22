package OCAJP.staticEntity;

public class TrickyCaseWithAbstractCall {


    public static void main(String[] args) {
        StaticClass s = new StaticClass();
        System.out.println(s.count);    // nothing special except calling static field via class instance

        s = null;
        System.out.println("s is null:" + (s == null));
        System.out.println(s.count);    // still WORKS because we looking for a static field in StaticClass
                                        // even an instance is set to null
    }
}
