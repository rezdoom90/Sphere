package by.epam.sphere.test;

import by.epam.sphere.action.InputFileDataReader;
import by.epam.sphere.entity.Sphere;
import by.epam.sphere.parser.StringDataParser;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.*;

public class SphereTest {
    Sphere sphere;

    @Test
    public void getRadiusTest () {
        try {
            sphere = new Sphere(StringDataParser.getCoordinates(InputFileDataReader.getFileData("")));
        } catch (IOException ex) {
            ex.printStackTrace();
            fail();
        }
        try {
            sphere.getRadius();
        } catch (NullPointerException e) {
            fail();
        }
    }

    @Test
    public void getRadiusTest_SphereIsNull () {
        try {
            sphere.getRadius();
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }

    @Test
    public void getRadiusTest_PointsAreNull () {
        sphere = new Sphere(null, null);
        try {
            sphere.getRadius();
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }
}
