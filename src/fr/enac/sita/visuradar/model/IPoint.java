package fr.enac.sita.visuradar.model;

import javafx.beans.property.DoubleProperty;

/**
 * Interface specifying the information available on a point.
 *
 * @author Pierre Rondin, Nicolas Saporito
 */
public interface IPoint {

    /**
     * Get the Property encapsulating the x-coordinate (Cautra coordinates).
     */
    public DoubleProperty xProperty();

    /**
     * Get the Property encapsulating the y-coordinate (Cautra coordinates).
     */
    public DoubleProperty yProperty();

    /**
     * Get the abscissa (Cautra coordinates).
     */
    public double getX();

    /**
     * Get the ordinate (Cautra coordinates).
     */
    public double getY();

    /**
     * Set the abscissa (Cautra coordinates).
     */
    public void setX(double x);

    /**
     * Set the ordinate (Cautra coordinates).
     */
    public void setY(double y);

    /**
     * Set new coordinates.
     * @param p Point whose coordinates are to be copied
     */
    public void set(IPoint p);

}
