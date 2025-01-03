import java.awt.Color;

public class VL19_FlyingObject {
    
    private VL12_CatesianPoint position;
    private VL12_CatesianPoint velocity;
    private Color color;
    private double radius;

    public Color getColor() {
        return this.color;
    }
    
    public VL12_CatesianPoint getPosition() {
        return this.position;
    }
    public double getRadius() {
        return this.radius;
    }


    public VL19_FlyingObject () {
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

    public void move() {
        if (position.getX() >  1 - radius || position.getX() < radius) {
            velocity = new VL12_CatesianPoint(-velocity.getX(), velocity.getY());
        }
        if (position.getY() >  1 - radius || position.getY() < radius) {
            velocity = new VL12_CatesianPoint(velocity.getX(), -velocity.getY());
        }
        position = position.add(velocity);
    }

    public void draw() {

    }

    @Override
    public String toString() {
        return position.toString() + " " + color;
    }
}
