package by.epam.sphere.entity;

/**
 * Created by Антон on 16.02.2017.
 */
public class Point {
    private double xPoint;
    private double yPoint;
    private double zPoint;
    
    public Point() {
    	
    }

    public double getxPoint() {
        return xPoint;
    }

    public void setxPoint(double xPoint) {
        this.xPoint = xPoint;
    }

    public void setyPoint(double yPoint) {
        this.yPoint = yPoint;
    }

    public void setzPoint(double zPoint) {
        this.zPoint = zPoint;
    }

    public double getyPoint() {
        return yPoint;
    }

    public double getzPoint() {
        return zPoint;
    }

    @Override
    public String toString() {
        return xPoint + " " + yPoint + " " + zPoint;
    }
}
