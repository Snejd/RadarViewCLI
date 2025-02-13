package fr.enac.sita.visuradar.model;

import fr.enac.sita.visuradar.data.cartoxanthane.CartographyManagerXanthane;
import java.util.List;
/**
 *
 * @author vlada
 */
public class cliTest {
    public static void main(String[] args) {
        CartographyManagerXanthane manager = new CartographyManagerXanthane();
        Airspace air = new Airspace(manager);
        
        
        List publishedBeacons = air.getPublicBeacons();
        // print first 3 published beacons
        for(int i=0;i<3;i++){
         System.out.println(publishedBeacons.get(i));
        }
        
        System.out.println("\n\n\n");

        List Sectors = air.getSectorsList();
        // print first 3  beacons
        for(int i=0;i<3;i++){
         System.out.println(Sectors.get(i));
        }
        
        System.out.println("\n\n\n");
        
        System.out.println("Is beacon SINPO in air?:" + air.containsBeacon("SINPO"));
        System.out.println("Is sector NU in air?:" + air.containsSector("NU"));
        
        System.out.println("Is beacon NIG in air?:" + air.containsBeacon("NIG"));
        System.out.println("Is sector PI in air?:" + air.containsSector("PI"));
        
        System.out.println("\n\n\n");
        Point P1 = new Point(50,356);
        Point P2 = new Point(50,400);
        Point P3 = new Point(55,410);
        Point P4 = new Point(60,400);
        Point P5 = new Point(75,350);
        Point P6 = new Point(70,368);
        Point P7 = new Point(60,356);
        
        
        Comet pointsFlew = new Comet(P1);
        pointsFlew.addCoordinates(P2);
        pointsFlew.addCoordinates(P3);
        System.out.println(pointsFlew);
        pointsFlew.addCoordinates(P4);
        pointsFlew.addCoordinates(P5);
        pointsFlew.addCoordinates(P6);
        pointsFlew.addCoordinates(P7);
        
        System.out.println(pointsFlew);
        
        System.out.println(P1.toString());
        Point PX = new Point(P1);
        System.out.println(PX.toString());
       
    }
}
