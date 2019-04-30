package OCAJP.overloading;

public class TestOverloadingMethodCalls {

    public void test(int i) {
        System.out.println(i);
    }

    public void test(float f) {
        System.out.println(f);
    }

    public static void main(String[] args) {
        TestOverloadingMethodCalls obj =
                new TestOverloadingMethodCalls();
        //obj.test(1.0); // won't compile because not suitable method
        // for test(double); but below works fine

        obj.test(1.0f);
    }

}
