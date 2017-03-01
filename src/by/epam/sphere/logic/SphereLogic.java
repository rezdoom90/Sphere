package by.epam.sphere.logic;

import by.epam.sphere.entity.Sphere;

public class SphereLogic {
    public static boolean isASphere (Sphere sphere) {
        return !(sphere.getSurfaceP().getX() == sphere.getCenterP().getX()
                && sphere.getSurfaceP().getY() == sphere.getCenterP().getY()
                && sphere.getSurfaceP().getZ() == sphere.getCenterP().getZ());
    }

    public static boolean crossesXY (Sphere sphere) {
        return (Math.abs(sphere.getCenterP().getZ()) - sphere.getRadius()) < 0;
    }

    public static boolean crossesXZ (Sphere sphere) {
        return (Math.abs(sphere.getCenterP().getY()) - sphere.getRadius()) < 0;
    }

    public static boolean crossesYZ (Sphere sphere) {
        return (Math.abs(sphere.getCenterP().getX()) - sphere.getRadius()) < 0;
    }

    public static boolean touchesXY (Sphere sphere) {
        return (Math.abs(sphere.getCenterP().getZ()) - sphere.getRadius()) == 0;
    }

    public static boolean touchesXZ (Sphere sphere) {
        return (Math.abs(sphere.getCenterP().getY()) - sphere.getRadius()) == 0;
    }

    public static boolean touchesYZ (Sphere sphere) {
        return (Math.abs(sphere.getCenterP().getX()) - sphere.getRadius()) == 0;
    }
}
