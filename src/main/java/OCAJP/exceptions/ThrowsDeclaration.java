package OCAJP.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDeclaration {
    public void exc() throws FileNotFoundException {
        throw new RuntimeException();       // possible to throw here
        //throw new java.io.IOException();    // broader isn't allowed
        //throw new Exception();              // broader isn't allowed
        //throw new IOException();            // broader isn't allowed
    }
}
