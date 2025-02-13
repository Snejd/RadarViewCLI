package fr.enac.sita.visuradar.model;
/**
 *
 * @author vlada
 */
public interface IBeacon extends IPoint {
     /**
     * Get the beacon Code (its name i.e. "TOU" or "AMOLO")
     * @return String containing Code 
     */
    public String getCode();

    /**
     * Get the beacon Type (can be "published" or "unpublished")
     * @return String containing Type 
     */
    public String getType();
}
