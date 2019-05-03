package OCAJP.wrappers;

public class CharacterCreation {
    public static void main(String[] args) {
        Character character = new Character('c');
        character = Character.valueOf('c');
        //character = Character.of();   //  doesn't exist
        //character = Character.decode();   // doesn't exist
    }
}
