package fr.enac.sita.visuradar.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 *
 * @author vlada
 */
public class Point implements IPoint {

    private final DoubleProperty x;
    private final DoubleProperty y;

    public Point(double x, double y) {
        this.x = new SimpleDoubleProperty(x);
        this.y = new SimpleDoubleProperty(y);
    }

    public Point(Point p) {
        // Correct Composition: Use interface methods
        this(p.getX(), p.getY()); // Calls the first constructor
    }

    @Override
    public DoubleProperty xProperty() {
        return this.x;
    }

    @Override
    public DoubleProperty yProperty() {
        return this.y;
    }

    @Override
    public Double getX() {
        return this.x.getValue();
    }

    @Override
    public Double getY() {
        return this.y.getValue();
    }

    @Override
    public void setX(double x) {
        this.x.setValue(x);
    }

    @Override
    public void setY(double y) {
        this.y.setValue(y);
    }

    @Override
    public void set(IPoint p) {
        this.x.setValue(p.getX());
        this.y.setValue(p.getY());
    }
    
    
    public static Point newInstance(Point p) {
        return new Point(p.getX(), p.getY());
    }
    
    
    @Override
    public String toString() {
        return "(" + this.x.getValue() + ", " + this.y.getValue() + ")";
    }
}
