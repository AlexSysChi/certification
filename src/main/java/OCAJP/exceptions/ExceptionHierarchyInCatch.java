package OCAJP.exceptions;

public class ExceptionHierarchyInCatch {
    static Integer i;

    public static void main(String[] args) {
        try{
            System.out.println(i.toString());
        } catch (RuntimeException re) {
            throw re;
        } catch (Exception e) {
            System.out.println("e");
        } finally {
            System.out.println("fin");
        }
    }
}
