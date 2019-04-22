package OCAJP.inheritance.protectedAccess.pond.swan;

import OCAJP.inheritance.protectedAccess.pond.shore.Bird;

public class Swan extends Bird {
    public void swim() {
        floatInWater();
        System.out.println(text);
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }
    public void helpOtherBirdSwim(){
        Bird other = new Bird();
        //other.floatInWater(); // doesn't compile
        //System.out.println(other.text);

    }
}
