import java.util.Locale;

public class Cylinder {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public Cylinder() {
        this.radius = 0.0;
        this.height = 0.0;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Cylinder: r=%.3f, h=%.3f, V=%.5f", radius, height, volume());
    }

    public static Cylinder[] sorted(Cylinder[] cylinders) {
        if (cylinders == null || cylinders.length == 0) {
            return new Cylinder[0];
        }

        Cylinder[] sortedCylinders = new Cylinder[cylinders.length];
        for (int i = 0; i < cylinders.length; i++) {
            sortedCylinders[i] = cylinders[i];
        }

        for (int i = 0; i < sortedCylinders.length - 1; i++) {
            for (int j = 0; j < sortedCylinders.length - 1 - i; j++) {
                if (sortedCylinders[j].volume() > sortedCylinders[j + 1].volume()) {
                    Cylinder temp = sortedCylinders[j];
                    sortedCylinders[j] = sortedCylinders[j + 1];
                    sortedCylinders[j + 1] = temp;
                }
            }
        }
        return sortedCylinders;
    }

    public static void main(String[] args) {
        Cylinder[] cylinders = new Cylinder[args.length / 2];
        for (int i = 0; i < args.length; i += 2) {
            double radius = Double.parseDouble(args[i]);
            double height = Double.parseDouble(args[i + 1]);
            cylinders[i / 2] = new Cylinder(radius, height);
        }

        Cylinder[] sortedCylinders = sorted(cylinders);
        for (Cylinder cylinder : sortedCylinders) {
            System.out.println(cylinder);
        }
    }
}


