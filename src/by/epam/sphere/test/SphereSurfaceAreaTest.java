package by.epam.sphere.test;

import by.epam.sphere.action.InputFileDataReader;
import by.epam.sphere.entity.Sphere;
import by.epam.sphere.parameter.SphereSurfaceArea;
import by.epam.sphere.parser.StringDataParser;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.*;

public class SphereSurfaceAreaTest {
    Sphere observed;

    @Test
    public void valueChangedTest () {
        try {
            observed = new Sphere(StringDataParser.getCoordinates(InputFileDataReader.getFileData("")));
        } catch (IOException e) {
            e.printStackTrace();
            fail();
        }
        observed.addObserver(new SphereSurfaceArea());
        assertFalse(observed.toString().isEmpty());
    }
}
