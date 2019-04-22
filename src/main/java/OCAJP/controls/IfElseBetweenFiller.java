package OCAJP.controls;

public class IfElseBetweenFiller {
    public static void main(String[] args) {
        boolean b = false;
        if (b) System.out.println("Before else block filler"); // single line if statement
        //{} couldn't be here, brcause its forbidden to place any statement between if-else(if else) blocks
        else System.out.println("'Before else block' filler"); // single line else statement
        {} // just init block

    }
}
