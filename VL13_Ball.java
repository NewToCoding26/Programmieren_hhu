import java.awt.Color;

public class VL13_Ball implements VL13_FlyingObject, VL15_Sortable{

    private VL12_CatesianPoint position;
    private VL12_CatesianPoint velocity;
    private Color color;
    private double radius;


    public VL13_Ball () {
        position = new VL12_CatesianPoint(Math.random() / 2 + 0.25, (Math.random() / 2 + 0.25));
        velocity = new VL12_CatesianPoint(Math.random() / 50 , Math.random() / 50);
        color = randomColor();
        radius = 0.02 + Math.random() / 20;
    }

    private static Color randomColor() {
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        return new Color(red, green, blue);
    }

    public void draw() {
        StdDraw.filledCircle(position.getX(), position.getY(), radius);
        StdDraw.setPenColor(color);
        
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return " Ball mit radius: " + getRadius();
    }

    public void move() {
        if (position.getX() >  1 - radius || position.getX() < radius) {
            velocity = new VL12_CatesianPoint(-velocity.getX(), velocity.getY());
        }
        if (position.getY() >  1 - radius || position.getY() < radius) {
            velocity = new VL12_CatesianPoint(velocity.getX(), -velocity.getY());
        }
        position = position.add(velocity);
    }

    public double getSortKey() {
        return radius;
    }
}
