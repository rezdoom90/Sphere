package by.epam.sphere.test;

import by.epam.sphere.action.InputFileDataReader;
import by.epam.sphere.entity.Sphere;
import by.epam.sphere.logic.SphereLogic;
import by.epam.sphere.parser.StringDataParser;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.*;

public class SphereLogicTest {
    Sphere sphere;

    @Test
    public void isASphereTest() {
        try {
            sphere = new Sphere(StringDataParser.getCoordinates(InputFileDataReader.getFileData("")));
        } catch (IOException ex) {
            ex.printStackTrace();
            fail();
        }
        try {
            assertTrue(SphereLogic.isASphere(sphere));
        } catch (NullPointerException e) {
            fail();
        }
    }

    @Test
    public void isASphereTest_SphereIsNull() {
        try {
            assertTrue(SphereLogic.isASphere(sphere));
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }

    @Test
    public void isASphereTest_PointsAreNull() {
        sphere = new Sphere(null, null);
        try {
            assertTrue(SphereLogic.isASphere(sphere));
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }

    @Test
    public void crossesXYTest() {
        try {
            sphere = new Sphere(StringDataParser.getCoordinates(InputFileDataReader.getFileData("")));
        } catch (IOException ex) {
            ex.printStackTrace();
            fail();
        }
        try {
            assertTrue(SphereLogic.crossesXY(sphere));
        } catch (NullPointerException e) {
            fail();
        }
    }

    @Test
    public void crossesXYTest_SphereIsNull() {
        try {
            assertTrue(SphereLogic.crossesXY(sphere));
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }

    @Test
    public void crossesXYTest_PointsAreNull() {
        sphere = new Sphere(null, null);
        try {
            assertTrue(SphereLogic.crossesXY(sphere));
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }

    @Test
    public void crossesXZTest() {
        try {
            sphere = new Sphere(StringDataParser.getCoordinates(InputFileDataReader.getFileData("")));
        } catch (IOException ex) {
            ex.printStackTrace();
            fail();
        }
        try {
            assertTrue(SphereLogic.crossesXZ(sphere));
        } catch (NullPointerException e) {
            fail();
        }
    }

    @Test
    public void crossesXZTest_SphereIsNull() {
        try {
            assertTrue(SphereLogic.crossesXZ(sphere));
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }

    @Test
    public void crossesXZTest_PointsAreNull() {
        sphere = new Sphere(null, null);
        try {
            assertTrue(SphereLogic.crossesXZ(sphere));
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }

    @Test
    public void crossesYZTest() {
        try {
            sphere = new Sphere(StringDataParser.getCoordinates(InputFileDataReader.getFileData("")));
        } catch (IOException ex) {
            ex.printStackTrace();
            fail();
        }
        try {
            assertTrue(SphereLogic.crossesYZ(sphere));
        } catch (NullPointerException e) {
            fail();
        }
    }

    @Test
    public void crossesYZTest_SphereIsNull() {
        try {
            assertTrue(SphereLogic.crossesYZ(sphere));
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }

    @Test
    public void crossesYZTest_PointsAreNull() {
        sphere = new Sphere(null, null);
        try {
            assertTrue(SphereLogic.crossesYZ(sphere));
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }

    @Test
    public void touchesXYTest_IsWrong() {
        try {
            sphere = new Sphere(StringDataParser.getCoordinates(InputFileDataReader.getFileData("")));
        } catch (IOException ex) {
            ex.printStackTrace();
            fail();
        }
        try {
            assertFalse(SphereLogic.touchesXY(sphere));
        } catch (NullPointerException e) {
            fail();
        }
    }

    @Test
    public void touchesXYTest_SphereIsNull() {
        try {
            assertFalse(SphereLogic.touchesXY(sphere));
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }

    @Test
    public void touchesXYTest_PointsAreNull() {
        sphere = new Sphere(null, null);
        try {
            assertFalse(SphereLogic.touchesXY(sphere));
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }

    @Test
    public void touchesXZTest_IsWrong() {
        try {
            sphere = new Sphere(StringDataParser.getCoordinates(InputFileDataReader.getFileData("")));
        } catch (IOException ex) {
            ex.printStackTrace();
            fail();
        }
        try {
            assertFalse(SphereLogic.touchesXZ(sphere));
        } catch (NullPointerException e) {
            fail();
        }
    }

    @Test
    public void touchesXZTest_SphereIsNull() {
        try {
            assertFalse(SphereLogic.touchesXZ(sphere));
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }

    @Test
    public void touchesXZTest_PointsAreNull() {
        sphere = new Sphere(null, null);
        try {
            assertFalse(SphereLogic.touchesXZ(sphere));
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }

    @Test
    public void touchesYZTest_IsWrong() {
        try {
            sphere = new Sphere(StringDataParser.getCoordinates(InputFileDataReader.getFileData("")));
        } catch (IOException ex) {
            ex.printStackTrace();
            fail();
        }
        try {
            assertFalse(SphereLogic.touchesYZ(sphere));
        } catch (NullPointerException e) {
            fail();
        }
    }

    @Test
    public void touchesYZTest_SphereIsNull() {
        try {
            assertFalse(SphereLogic.touchesYZ(sphere));
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }

    @Test
    public void touchesYZTest_PointsAreNull() {
        sphere = new Sphere(null, null);
        try {
            assertFalse(SphereLogic.touchesYZ(sphere));
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }
}
