package by.epam.sphere.entity;

import by.epam.sphere.observer.OperationObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;

import static org.apache.logging.log4j.Level.INFO;

public class Sphere {
    static Logger logger = LogManager.getLogger();
    private Point centerP;
    private Point surfaceP;
    private ArrayList<OperationObserver> observerList = new ArrayList<>();

    public Sphere() {

    }

    public Sphere(Point centerP, Point surfaceP) {
        this.centerP = centerP;
        this.surfaceP = surfaceP;
    }

    public Sphere(ArrayList<Double> coordinates) {
        this.setCenterP(new Point(coordinates.get(0), coordinates.get(1), coordinates.get(2)));
        this.setSurfaceP(new Point(coordinates.get(3), coordinates.get(4), coordinates.get(5)));
    }

    public void setCenterP(Point centerP) {
        this.centerP = centerP;
    }

    public void setSurfaceP(Point surfaceP) {
        this.surfaceP = surfaceP;
    }

    public Point getCenterP() {
        return centerP;
    }

    public Point getSurfaceP() {
        return surfaceP;
    }

    public void addObserver(OperationObserver observer) {
        observerList.add(observer);
        logger.log(INFO, "Observer has been created successfully.");
    }

    private void notifyObservers() {
        Iterator it = observerList.iterator();
        while (it.hasNext()) {
            ((OperationObserver) it.next()).valueChanged(this);
        }
        logger.log(INFO, "Values changed. Observers notified.");
    }

    public double getRadius () {
        double radius;

        radius = Math.sqrt(Math.pow((this.surfaceP.getX() - this.centerP.getX()), 2)
                + Math.pow((this.surfaceP.getY() - this.centerP.getY()), 2)
                + Math.pow((this.surfaceP.getZ() - this.centerP.getZ()), 2));

        logger.log(INFO, "Received sphere radius of " + radius);

        return radius;
    }

    private static Sphere ourInstance = new Sphere();

    public static Sphere getInstance() {
        return ourInstance;
    }

    @Override
    public String toString() {
        String s = "";
        Iterator it = observerList.iterator();
        while (it.hasNext()) {
            s = s +
                    ((OperationObserver) it.next()).toString() + '\n';
        }
        return s;
    }
}
