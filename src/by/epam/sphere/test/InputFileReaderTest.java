package by.epam.sphere.test;

import by.epam.sphere.action.InputFileDataReader;
import by.epam.sphere.exception.WrongDataPathException;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class InputFileReaderTest {
    WrongDataPathException ex;

    @Test
    public void testGetFileData_FileDoesNotExist() {
        try {
            InputFileDataReader.getFileData("file.txt");
            fail();
        } catch (IOException e) {
            //Success
        }
    }

    @Test
    public void testGetFileData_FileHasData() {
        try {
            assertTrue (InputFileDataReader.getFileData("src/by/epam/sphere/data/Input.txt").size() > 0);
        } catch (IOException e) {
            ex = new WrongDataPathException();
            ex.printStackTrace();
            fail();
        }
    }

    @Test
    public void testGetFileData_DefaultFileDoesExist() {
        try {
            InputFileDataReader.getFileData("");
        } catch (IOException e) {
            ex = new WrongDataPathException();
            ex.printStackTrace();
            fail();
        }
    }

    @Test
    public void testGetFileData_DefaultFileHasData() {
        try {
            assertTrue (InputFileDataReader.getFileData("").size() > 0);
        } catch (IOException e) {
            ex = new WrongDataPathException();
            ex.printStackTrace();
            fail();
        }
    }
}
