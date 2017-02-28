package by.epam.sphere.entity;

import by.epam.sphere.logic.SphereLogic;

public class Sphere {
	private Point centerP;
    private Point surfaceP;

    public Sphere() {

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

    public double getRadius () {
        double radius;

        radius = Math.sqrt(Math.pow((this.surfaceP.getX() - this.centerP.getX()), 2)
                + Math.pow((this.surfaceP.getY() - this.centerP.getY()), 2)
                + Math.pow((this.surfaceP.getZ() - this.centerP.getZ()), 2));

        return radius;
    }

    public double getSurfaceArea () {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    public double getValue () {
        return (4 / 3) * Math.PI * Math.pow(getRadius(), 3);
    }

    public double getXYDissectionValueRatio () {
        if (this.getCenterP().getZ() < this.getSurfaceP().getZ()) {
            return (Math.PI * Math.pow(this.getSurfaceP().getZ(), 2)
                    * (this.getRadius() - this.getSurfaceP().getZ() / 3))
                    / this.getValue();
        } else {
            return (Math.PI * Math.pow(this.getCenterP().getZ(), 2)
                    * (this.getRadius() - this.getCenterP().getZ() / 3))
                    / this.getValue();
        }
    }

    public double getXZDissectionValueRatio () {
        if (this.getCenterP().getY() < this.getSurfaceP().getY()) {
            return (Math.PI * Math.pow(this.getSurfaceP().getY(), 2)
                    * (this.getRadius() - this.getSurfaceP().getY() / 3))
                    / this.getValue();
        } else {
            return (Math.PI * Math.pow(this.getCenterP().getY(), 2)
                    * (this.getRadius() - this.getCenterP().getY() / 3))
                    / this.getValue();
        }
    }

    public double getYZDissectionValueRatio () {
        if (this.getCenterP().getX() < this.getSurfaceP().getX()) {
            return (Math.PI * Math.pow(this.getSurfaceP().getX(), 2)
                    * (this.getRadius() - this.getSurfaceP().getX() / 3))
                    / this.getValue();
        } else {
            return (Math.PI * Math.pow(this.getCenterP().getX(), 2)
                    * (this.getRadius() - this.getCenterP().getX() / 3))
                    / this.getValue();
        }
    }

    private static Sphere ourInstance = new Sphere();

    public static Sphere getInstance() {
        return ourInstance;
    }

    @Override
    public String toString() {
        return centerP.toString() + ", " + surfaceP.toString();
    }
}
