public class VL12_CatesianPoint implements VL12_PointInterfaces {
    private final double x;
    private final double y;

    public VL12_CatesianPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return this.y;
    }

    public double getX() {
        return this.x;
    }

    public VL12_PointInterfaces subtract(VL12_PointInterfaces otherPoint) {
        double newX = this.x - otherPoint.getX();
        double newY = this.y - otherPoint.getY();
        return new VL12_CatesianPoint(newX, newY);
    }

    public boolean equals(VL12_CatesianPoint that) {
        return this.x == that.x && this.y == that.y;
    }

    public String toString() {
        return x + " " + y;
    }

    public double getRadius() {
        return Math.sqrt(x * x + y *y);
    }

    public double getTheta() {
        return Math.atan2(y, x);
    }
}
