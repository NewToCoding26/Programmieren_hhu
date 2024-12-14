public class Blatt2_Aufgabe2 {
    public static void main(String[] args) {
        double startPosition = Double.parseDouble(args[0]);
        double geschwindigkeit = Double.parseDouble(args[1]);
        double zeit = Double.parseDouble(args[2]);
        double erdBeschleunigung = 9.81;

        double berechnung = startPosition + geschwindigkeit * zeit - (erdBeschleunigung * zeit * zeit / 2);

        System.out.println(berechnung);
    }
}
