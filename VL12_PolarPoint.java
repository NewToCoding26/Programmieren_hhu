public class VL12_PolarPoint implements VL12_PointInterfaces{
    private final double radius;
    private final double theta;

    public VL12_PolarPoint(double radius, double theta) {
        this.radius = radius;
        this.theta = theta;
    }

    public double getY() {
    return radius * Math.sin(theta);

    }

    public double getX() {
        return radius * Math.cos(theta);
    }

    public VL12_PointInterfaces subtract(VL12_PointInterfaces otherPoint) {
        double newX = this.getX() - otherPoint.getX();
        double newY = this.getY() - otherPoint.getY();
        double newRadius = Math.sqrt(newX * newX + newY * newY);
        double newtheta = Math.atan2(newY, newX);
        return new VL12_PolarPoint(newRadius, newtheta);
    }

    public boolean equals(VL12_PolarPoint that) {
        return this.radius == that.radius && this.theta == that.theta;
    }

    public String toString() {
        return getX() + " " + getY();
    }

    public double getRadius() {
        return radius;
    }

    public double getTheta() {
        return theta;
    }
}
