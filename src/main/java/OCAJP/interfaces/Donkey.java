package OCAJP.interfaces;

public class Donkey implements Movable {
    int location = 200;
    @Override
    public void move(int by) {
        location += by;
    }

    @Override
    public void moveBack(int by) {
        location -= by;
    }
}

//@FunctionalInterface in such case only one abstract method is allowed

