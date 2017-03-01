package by.epam.sphere.test;

import static org.junit.Assert.*;

import by.epam.sphere.parser.StringDataParser;
import org.junit.Test;
import java.util.ArrayList;

public class StringDataParserTest {
    ArrayList<String> array;

    @Test
    public void testGetCoordinates_HasNullInputArray () {
        try {
            StringDataParser.getCoordinates(array);
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }

    @Test
    public void testGetCoordinates_HasEmptyInputArray () {
        array = new ArrayList<>();
        assertTrue(StringDataParser.getCoordinates(array).isEmpty());
    }
}
