package all;

public class Egret_12 {
    private String color;

    public Egret_12() {
        this("white");
    }

    public Egret_12(String color) {
        color = color;
    }

    public static void main(String[] args) {
        Egret_12 e = new Egret_12();
        System.out.println("Color:" + e.color);
    }
}