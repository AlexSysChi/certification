package OCAJP.examples;

public class RandomNumberGenerator {

    public static void main(String[] args) {


        double random = Math.random();
        System.out.println(random);

        System.out.println((int) random);
        System.out.println((int) (random * 6));

        int result1 = ((int) random) * 6 + 1;
        System.out.println(result1);

        int result2 = (int) (random * 6) + 1;
        System.out.println(result2);

    }

}
