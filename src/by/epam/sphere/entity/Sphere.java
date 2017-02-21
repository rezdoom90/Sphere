package by.epam.sphere.entity;

import java.util.ArrayList;

/**
 * Created by Антон on 16.02.2017.
 */
public class Sphere {
	private static Point centerP = new Point();
    private static Point surfaceP = new Point();

    public static void setCenterP(Point centerP) {
        Sphere.centerP = centerP;
    }

    public static void setSurfaceP(Point surfaceP) {
        Sphere.surfaceP = surfaceP;
    }

    public static double getSphereSurfaceArea () {
        return 0.0; //4 * Math.PI * Math.pow(, 2); //
    }


    private static Sphere ourInstance = new Sphere();

    public static Sphere getInstance() {
        return ourInstance;
    }

    public Sphere() {
    	
    }

    public static void setPoints(ArrayList<Double> coordinates) {
        
    }

    @Override
    public String toString() {
        return centerP.toString() + ", " + surfaceP.toString();
    }
}
