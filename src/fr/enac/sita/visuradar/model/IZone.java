package fr.enac.sita.visuradar.model;

import java.util.List;

/**
 * Area representing a convex space 
 * (e.g. the different layers of a sector or the map outlines). 
 *
 * @author Pierre Rondin
 */
public interface IZone {

    /**
     * Get the center of the zone.
     */
    public IPoint getCentre();

    /**
     * Get the FL of the floor of the zone.
     */
    public String getFloor();

    /**
     * Get the FL of the ceiling of the zone.
     */
    public String getCeiling();

    /**
     * Get a copy of the list of points that constitute the zone
     */
    public List<IPoint> getVertexes();

    /**
     * Get an array of Double containing all the points that constitute the zone. 
     * Array in the form [x0, y0, x1, y1,...]
     */
    public Double[] getVertexesXYArray();

}
