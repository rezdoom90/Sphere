package by.epam.sphere.observer;

import by.epam.sphere.entity.Sphere;

public abstract class OperationObserver {
    public abstract double valueChanged(Sphere observed);
}
