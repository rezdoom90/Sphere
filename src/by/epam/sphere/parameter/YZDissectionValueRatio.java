package by.epam.sphere.parameter;

import by.epam.sphere.entity.Sphere;
import by.epam.sphere.observer.OperationObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.apache.logging.log4j.Level.INFO;

public class YZDissectionValueRatio extends OperationObserver {
    static Logger logger = LogManager.getLogger();
    private double yzDissectionValueRatio;

    public double getYZDissectionValueRatio() {
        return yzDissectionValueRatio;
    }

    public double valueChanged(Sphere observed) {
        double positiveP;

        if (observed.getCenterP().getX() < observed.getSurfaceP().getX()) {
            positiveP = observed.getSurfaceP().getX();
        } else {
            positiveP = observed.getCenterP().getX();
        }

        logger.log(INFO, "Sphere DVR (YZ) changed successfully.");

        return yzDissectionValueRatio = (Math.PI * Math.pow(positiveP, 2)
                * (observed.getRadius() - positiveP / 3))
                / (4 / 3) * Math.PI * Math.pow(observed.getRadius(), 3);
    }

    @Override
    public String toString() {
        return "DVR (YZ) = " + yzDissectionValueRatio;
    }
}
