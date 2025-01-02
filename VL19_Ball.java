import java.awt.Color;

public class VL19_Ball extends VL19_FlyingObject{

    public void draw() {
        StdDraw.filledCircle(position.getX(), position.getY(), radius);
        StdDraw.setPenColor(color);
        
    }

}