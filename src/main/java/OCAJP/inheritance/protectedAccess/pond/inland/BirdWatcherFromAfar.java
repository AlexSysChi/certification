package OCAJP.inheritance.protectedAccess.pond.inland;

import OCAJP.inheritance.protectedAccess.pond.shore.Bird;

public class BirdWatcherFromAfar {
    public void watchBird(){
        Bird bird = new Bird();
        //bird.floatInWater();                // does not compile due to protected access modifier
        //System.out.println(bird.text);      // does not compile due to protected access modifier
    }
}
