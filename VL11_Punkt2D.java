public class VL11_Punkt2D {
    private double x;
    private double y;

    public VL11_Punkt2D(double x, double y) {
        this.setX(x);
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double newX) {
        if (newX == Double.POSITIVE_INFINITY) {
            System.out.println(newX + " ist ungültig");
            return;
        }
        this.x = newX;
    }

    public void print() {
        System.out.println(this.x + " " + this.y);
    }

    public void subtract (VL11_Punkt2D other) {
        this.x = this.x - other.x;
        this.y = this.y - other.y; 
    }

    public String toString() {
        return x + " " + y;
    }

    public boolean equals(VL11_Punkt2D other) {
        return this.x == other.x && this.y == other.y;
    }

 }
