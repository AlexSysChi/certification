package all;

public class Deer8 {
    public Deer8() {
        System.out.print("Deer8");
    }
    public Deer8(int age) {
        System.out.print("DeerAge");
    }
    private boolean hasHorns() {
        return false;
    }
    public static void main(String[] args) {
        Deer8 deer8 = new Reindeer(5);
        System.out.println("," + deer8.hasHorns());
    }
}

class Reindeer extends Deer8 {
    public Reindeer(int age) {
        System.out.print("Reindeer");
    }
    //@Override
    public boolean hasHorns() {
        return true;
    }
}