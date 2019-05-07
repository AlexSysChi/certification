package OCAJP.exceptions;

public class MultiCatchExample {

    static Integer i;

    public static void main(String[] args) {
        try {
            System.out.println(i.doubleValue());
//        }
            // catch (NullPointerException | RuntimeException e) {
//        } catch (RuntimeException | NullPointerException e) {
//
//            System.out.println(e.getClass().getSimpleName());
      } finally {

        }
    }

}
