package fr.enac.sita.visuradar.model;


import fr.enac.sita.visuradar.data.cartoxanthane.CartographyManagerXanthane;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author vlada
 */
public class Airspace{
    
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
    
    public List<ISector> getSectorsList(){
        List<ISector> sectorsL = new ArrayList<>();
        for (ISector sector : this.sectors.values()) {
                sectorsL.add(sector);
        }
        return sectorsL;
    }
    
    public Map<String, IBeacon> getBeaconsByNameMap() {
        return beacons;
    }

    public Map<String, ISector> getSectorsByNameMap() {
        return sectors;
    }
    
    public boolean containsSector(String sector){
        for (ISector s : this.sectors.values()) {
            if(s.getName().equals(sector)){
                return true;
            }
        }
        return false;
    }
    
    public boolean containsBeacon(String beacon){
        for (IBeacon b : this.beacons.values()) {
            if(b.getCode().equals(beacon)){
                return true;
            }
        }
        return false;
    }

}
