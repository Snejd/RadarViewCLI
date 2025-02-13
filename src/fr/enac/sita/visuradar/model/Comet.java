package fr.enac.sita.visuradar.model;
/**
 *
 * @author vlada
 */
public class Comet {
    
    private final Point[] points = new Point[5];

    public Comet(Point point) {
        this.points[0] = new Point(point);
    }
    
    public void addCoordinates(Point p){
        for(int i = 0; i < this.points.length; i++) {
            if(this.points[i] == null){
                this.points[i] = new Point(p);
                break;
            }else if(i == this.points.length-1){
                this.points[0] = this.points[1];
                this.points[1] = this.points[2];
                this.points[2] = this.points[3];
                this.points[3] = this.points[4];
                this.points[4] = new Point(p);
            }
        }
    }
            
    
    public Point getP1(){
        return Point.newInstance(this.points[0]);
    }
    public Point getP2(){
        return Point.newInstance(this.points[1]);
    }
    public Point getP3(){
        return Point.newInstance(this.points[2]);
    }
    public Point getP4(){
        return Point.newInstance(this.points[3]);
    }
    public Point getP5(){
        return Point.newInstance(this.points[4]);
    }
    
    
    @Override
    public String toString() {
        String ret = "---------------\nComet points\n";
        for(int i = 0; i < this.points.length; i++) {
            if(this.points[i] == null){
                ret+=("P"+(i+1)+": not inicialized\n");
            }else{
                ret+=("P"+(i+1)+": (" + this.points[i].getX() + ", " + this.points[i].getY() + ")\n");
            }            
        }
        ret+="---------------";
        return ret;
    }
    
}
