import java.awt.Color;

public class VL13_Square extends VL19_FlyingObject{

    public void draw() {
        StdDraw.filledRectangle(position.getX(), position.getY(), radius, radius);
        StdDraw.setPenColor(color);
    }
}
