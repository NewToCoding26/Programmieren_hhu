import java.awt.Color;

public class VL19_Ball extends VL13_FlyingObject{
    public void draw() {
        StdDraw.setPenColor(getColor());
        StdDraw.filledCircle(getPosition().getX(), 
                             getPosition().getY(),
                             getRadius());

                              
    }
}
