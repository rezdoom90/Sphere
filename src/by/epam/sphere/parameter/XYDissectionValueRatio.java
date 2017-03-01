package by.epam.sphere.parameter;

import by.epam.sphere.entity.Sphere;
import by.epam.sphere.observer.OperationObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.apache.logging.log4j.Level.INFO;

public class XYDissectionValueRatio extends OperationObserver {
    static Logger logger = LogManager.getLogger();
    private double xyDissectionValueRatio;

    public double getXYDissectionValueRatio() {
        return xyDissectionValueRatio;
    }

    public double valueChanged(Sphere observed) {
        double positiveP;

        if (observed.getCenterP().getZ() < observed.getSurfaceP().getZ()) {
            positiveP = observed.getSurfaceP().getZ();
        } else {
            positiveP = observed.getCenterP().getZ();
        }

        logger.log(INFO, "Sphere DVR (XY) changed successfully.");

        return xyDissectionValueRatio = (Math.PI * Math.pow(positiveP, 2)
                * (observed.getRadius() - positiveP / 3))
                / (4 / 3) * Math.PI * Math.pow(observed.getRadius(), 3);
    }

    @Override
    public String toString() {
        return "DVR (XY) = " + xyDissectionValueRatio;
    }
}
