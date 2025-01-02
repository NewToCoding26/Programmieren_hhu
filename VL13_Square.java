import java.awt.Color;

public class VL13_Square extends VL19_FlyingObject{

    public void draw() { 
        StdDraw.filledRectangle(this.getPosition().getX(), this.getPosition().getY(), this.getRadius(), this.getRadius());
        StdDraw.setPenColor(this.getColor());
    }
}
