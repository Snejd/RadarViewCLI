package fr.enac.sita.visuradar.model;


import fr.enac.sita.visuradar.data.cartoxanthane.CartographyManagerXanthane;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import javafx.beans.property.DoubleProperty;

/**
 *
 * @author vlada
 */
public class Airspace implements IBeacon, ISector {
    
    private final Map<String, IBeacon> beacons;
    private final Map<String, ISector> sectors;
    
    public Airspace(CartographyManagerXanthane cartographyManager) {
        this.beacons = new HashMap<>();
        this.sectors = new HashMap<>();
        
        // Retrieve and store beacons
        List<IBeacon> beaconList = cartographyManager.loadBeacons();
        for (IBeacon beacon : beaconList) {
            beacons.put(beacon.getCode(), beacon);
        }

        // Retrieve and store sectors
        List<ISector> sectorList = cartographyManager.loadSectors();
        for (ISector sector : sectorList) {
            sectors.put(sector.getName(), sector); 
        }
    }

    public List<IBeacon> getPublicBeacons(){
        List<IBeacon> pBeacons = new ArrayList<>();
        for (IBeacon beacon : this.beacons.values()) {
            if(beacon.getType().equals("published")){
                pBeacons.add(beacon);
            }
        }
        return pBeacons;
    }
    
    
    
    
    
    //TODO implement interface methods
    @Override
    public String getCode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getFloor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getCeiling() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getAcc() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<IZone> getSlices() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setSlices(List<IZone> slices) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DoubleProperty xProperty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DoubleProperty yProperty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Double getX() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Double getY() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setX(double x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setY(double y) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void set(IPoint p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
