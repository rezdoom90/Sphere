package by.epam.sphere.exception;

import java.io.PrintStream;

public class WrongDataPathException extends Exception {
    public WrongDataPathException () {

    }

    @Override
    public void printStackTrace(PrintStream s) {

        System.err.println("Wrong data path!");
    }
}
