package OCAJP.AccessLevels.super_level;

public class SuperClass {

    protected SuperClass(){

    }

    public int publicInt;
    protected int protectedInt;

    public void publicDoer() {
        System.out.println("public doer");
    }

    protected void protectedDoer(){
        System.out.println("protected doer");
    }

}
