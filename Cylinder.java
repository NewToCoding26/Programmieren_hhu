import java.util.Locale;

public class Cylinder {

    // Private Instanzvariablen für Radius und Höhe
    private double radius;
    private double height;

    // Konstruktor mit Parametern (Radius und Höhe)
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Konstruktor ohne Parameter (Radius und Höhe = 0.0)
    public Cylinder() {
        this.radius = 0.0;
        this.height = 0.0;
    }

    // Methode zur Berechnung des Volumens
    public double calculateVolume() {
        return 3.14159 * radius * radius * height;
    }

    // Methode zur Darstellung des Zylinders als String mit String.format
    @Override
    public String toString() {
        return String.format(Locale.US, "Cylinder: r=%.1f, h=%.1f, V=%.5f", radius, height, calculateVolume());
    }

    // Statische Methode zum Sortieren der Zylinder nach Volumen
    public static Cylinder[] sortCylinders(Cylinder[] cylinders) {
        // Manuelle Kopie des Arrays
        Cylinder[] sortedCylinders = new Cylinder[cylinders.length];
        for (int i = 0; i < cylinders.length; i++) {
            sortedCylinders[i] = cylinders[i];
        }

        // Bubble-Sort-Algorithmus
        for (int i = 0; i < sortedCylinders.length - 1; i++) {
            for (int j = 0; j < sortedCylinders.length - 1 - i; j++) {
                if (sortedCylinders[j].calculateVolume() > sortedCylinders[j + 1].calculateVolume()) {
                    // Zylinder tauschen
                    Cylinder temp = sortedCylinders[j];
                    sortedCylinders[j] = sortedCylinders[j + 1];
                    sortedCylinders[j + 1] = temp;
                }
            }
        }
        return sortedCylinders;
    }

    // Hauptmethode zur Ausführung des Programms
    public static void main(String[] args) {
        // Validierung der Argumentanzahl
        if (args.length % 2 != 0) {
            System.out.println("Fehler: Ungültige Anzahl von Argumenten.");
            return;
        }

        // Erstellung des Arrays von Zylindern
        Cylinder[] cylinders = new Cylinder[args.length / 2];
        for (int i = 0; i < args.length; i += 2) {
            double radius = Double.parseDouble(args[i]);
            double height = Double.parseDouble(args[i + 1]);
            cylinders[i / 2] = new Cylinder(radius, height);
        }

        // Sortierung und Ausgabe der Zylinder
        Cylinder[] sortedCylinders = sortCylinders(cylinders);
        for (int i = 0; i < sortedCylinders.length; i++) {
            System.out.println(sortedCylinders[i].toString());
        }
    }
}

