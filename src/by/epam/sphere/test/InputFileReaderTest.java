package by.epam.sphere.test;

import by.epam.sphere.action.InputFileDataReader;
import by.epam.sphere.exception.WrongDataPathException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class InputFileReaderTest {
    WrongDataPathException ex;

    @Before
    public void setUp() throws Exception {
        ex = new WrongDataPathException();
    }

    @Test
    public void testGetFileData_FileDoesNotExist() {
        try {
            InputFileDataReader.getFileData("file.txt");
        } catch (IOException e) {
            ex.printStackTrace();
        }
    }

    @Test
    public void testGetFileData_ReadFileData() {
        try {
            assertTrue (InputFileDataReader.getFileData("src/by/epam/sphere/data/Input.txt").size() > 0);
        } catch (IOException e) {
            ex.printStackTrace();
        }
    }
}
