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

        // Schleife durch die Liste der Zahlen (bis zum vorletzten Element)
        for (int i = 1; i < numbers.length - 1; i++) {
            // Überprüfen, ob wir ein Plateau gefunden haben
            if (numbers[i] == numbers[i - 1] || numbers[i] == numbers[i + 1]) {
                // Start des Plateaus gefunden
                int plateauStart = i;
                int plateauEnd = i;

                // Plateau ausdehnen, solange die Zahlen gleich sind
                while (plateauEnd + 1 < numbers.length && numbers[plateauEnd] == numbers[plateauEnd + 1]) {
                    plateauEnd++;
                }

                // Überprüfen, ob das Plateau von kleineren Zahlen umgeben ist
                if (plateauStart > 0 && plateauEnd < numbers.length - 1 &&
                        numbers[plateauStart - 1] < numbers[plateauStart] &&
                        numbers[plateauEnd + 1] < numbers[plateauEnd]) {

                    // Plateau-Länge und Start-Index speichern, wenn es länger ist als das vorherige
                    int plateauLength = plateauEnd - plateauStart + 1;
                    if (plateauLength > longestPlateauLength) {
                        longestPlateauLength = plateauLength;
                        longestPlateauStart = plateauStart;
                    }
                }

                // Zum Ende des Plateaus springen
                i = plateauEnd;
            }
        }

        // Ergebnis ausgeben
        if (longestPlateauLength > 0) {
            System.out.println(longestPlateauStart + " " + longestPlateauLength);
        } else {
            System.out.println("Kein Plateau");
        }
    }
}




