package fr.enac.sita.visuradar.model;

import fr.enac.sita.visuradar.data.cartoxanthane.CartographyManagerXanthane;
/**
 *
 * @author vlada
 */
public class cliTest {
    public static void main(String[] args) {
        CartographyManagerXanthane manager = new CartographyManagerXanthane();
        Airspace air = new Airspace(manager);
        
        System.out.println(air.getPublicBeacons());
        
        
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
       
    }
}
