public class VL12_Point {
    private final double radius;
    private final double theta;

    public VL12_Point(double radius, double theta) {
        this.radius = radius;
        this.theta = theta;
    }

    public double getY() {
    return radius * Math.sin(theta);

    }

    public double getX() {
        return radius * Math.cos(theta);
    }

    public VL12_Point subtract(VL12_Point otherPoint) {
        double newX = this.getX() - otherPoint.getX();
        double newY = this.getY() - otherPoint.getY();
        double newRadius = Math.sqrt(newX * newX + newY * newY);
        double newtheta = Math.atan2(newY, newX);
        return new VL12_Point(newRadius, newtheta);
    }

    public boolean equals(VL12_Point that) {
        return this.radius == that.radius && this.theta == that.theta;
    }

    public String toString() {
        return getX() + " " + getY();
    }

    public double radius() {
        return radius;
    }

    public double theta() {
        return theta;
    }
}
