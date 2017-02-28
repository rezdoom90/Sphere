package by.epam.sphere.entity;

public class Point {
    private double x;
    private double y;
    private double z;
    
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
    	this.z = z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public boolean equals(Point point) {
        return this.getX() == point.getX() && this.getY() == point.getY() && this.getZ() == point.getZ();
    }

    @Override
    public String toString() {
        return x + " " + y + " " + z;
    }
}
