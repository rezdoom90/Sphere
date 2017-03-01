package by.epam.sphere.parameter;

import by.epam.sphere.entity.Sphere;
import by.epam.sphere.observer.OperationObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.apache.logging.log4j.Level.INFO;

public class SphereSurfaceArea extends OperationObserver {
    static Logger logger = LogManager.getLogger();
    private double surfaceArea;

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double valueChanged(Sphere observed) {
        logger.log(INFO, "Sphere surface area changed successfully.");
        return surfaceArea = 4 * Math.PI * Math.pow(observed.getRadius(), 2);
    }

    @Override
    public String toString() {
        return "SA = " + surfaceArea;
    }
}
