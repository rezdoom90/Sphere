package by.epam.sphere.parameter;

import by.epam.sphere.entity.Sphere;
import by.epam.sphere.observer.OperationObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.apache.logging.log4j.Level.INFO;

public class XZDissectionValueRatio extends OperationObserver {
    static Logger logger = LogManager.getLogger();
    private double xzDissectionValueRatio;

    public double getXZDissectionValueRatio() {
        return xzDissectionValueRatio;
    }

    public double valueChanged(Sphere observed) {
        double positiveP;

        if (observed.getCenterP().getY() < observed.getSurfaceP().getY()) {
            positiveP = observed.getSurfaceP().getY();
        } else {
            positiveP =  observed.getCenterP().getY();
        }

        logger.log(INFO, "Sphere DVR (XZ) changed successfully.");

        return xzDissectionValueRatio = (Math.PI * Math.pow(positiveP, 2)
                * (observed.getRadius() - positiveP / 3))
                / (4 / 3) * Math.PI * Math.pow(observed.getRadius(), 3);
    }

    @Override
    public String toString() {
        return "DVR (XZ) = " + xzDissectionValueRatio;
    }
}
