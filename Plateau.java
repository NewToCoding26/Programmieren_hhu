public class Plateau {

    public static void main(String[] args) {
        // Prüfen, ob genug Zahlen übergeben wurden
        if (args.length < 3) {
            System.out.println("ERROR: Bitte mindestens 3 Zahlen übergeben!");
            return;
        }

        // Umwandeln der Eingaben in ein Array von Ganzzahlen
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        // Variablen für die Plateau-Analyse
        int longestPlateauStart = -1;
        int longestPlateauLength = 0;

        // Schleife durch die Liste der Zahlen
        for (int i = 0; i < numbers.length; i++) {
            // Plateau-Start und -Ende ermitteln
            int plateauStart = i;
            int plateauEnd = i;

            // Plateau ausdehnen, solange die Werte gleich bleiben
            while (plateauEnd + 1 < numbers.length && numbers[plateauEnd] == numbers[plateauEnd + 1]) {
                plateauEnd++;
            }

            // Überprüfen, ob das Plateau gültig ist (von kleineren Zahlen umgeben)
            if (plateauStart > 0 && plateauEnd < numbers.length - 1 &&
                    numbers[plateauStart - 1] < numbers[plateauStart] &&
                    numbers[plateauEnd + 1] < numbers[plateauEnd]) {

                int plateauLength = plateauEnd - plateauStart + 1;

                // Längstes Plateau speichern
                if (plateauLength > longestPlateauLength) {
                    longestPlateauLength = plateauLength;
                    longestPlateauStart = plateauStart;
                }
            }

            // Schleifen-Index auf das Ende des Plateaus setzen
            i = plateauEnd;
        }

        // Ergebnis ausgeben
        if (longestPlateauLength > 0) {
            System.out.println(longestPlateauStart + " " + longestPlateauLength);
        } else {
            System.out.println("Kein Plateau");
        }
    }
}





