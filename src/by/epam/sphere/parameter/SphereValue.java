package by.epam.sphere.parameter;

import by.epam.sphere.entity.Sphere;
import by.epam.sphere.observer.OperationObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.apache.logging.log4j.Level.INFO;

public class SphereValue extends OperationObserver {
    static Logger logger = LogManager.getLogger();
    private double value;

    public double getValue() {
        return value;
    }

    public double valueChanged(Sphere observed) {
        logger.log(INFO, "Sphere value changed successfully.");
        return value = (4 / 3) * Math.PI * Math.pow(observed.getRadius(), 3);
    }

    @Override
    public String toString() {
        return "V = " + value;
    }
}
