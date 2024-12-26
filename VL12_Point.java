public class VL12_Point {
    private final double x;
    private final double y;

    public VL12_Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return this.y;
    }

    public double getX() {
        return this.x;
    }

    public VL12_Point subtract(VL12_Point otherPoint) {
        double newX = this.x - otherPoint.x;
        double newY = this.y - otherPoint.y;
        return new VL12_Point(newX, newY);
    }

    public boolean equals(VL12_Point that) {
        return this.x == that.x && this.y == that.y;
    }

    public String toString() {
        return x + " " + y;
    }

    public double radius() {
        return Math.sqrt(x * x + y *y);
    }

    public double theta() {
        return Math.atan2(y, x);
    }
}
