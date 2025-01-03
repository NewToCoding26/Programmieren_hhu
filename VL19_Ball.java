import java.awt.Color;

public class VL19_Ball extends VL19_FlyingObject{

    public void draw() {
            
        StdDraw.filledCircle(this.getPosition().getX(), this.getPosition().getY(), this.getRadius());
        StdDraw.setPenColor(this.getColor());
        
    }

    
    @Override
    public String toString() {
        return "Ball @" + super.toString();
    }

}