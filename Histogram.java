import java.util.Scanner;

public class Histogram {

   // Hilfsmethode zur Überprüfung, ob ein String eine Ganzzahl ist
private static boolean istGanzeZahl(String str) {
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (i == 0 && c == '-') continue; // Erlaubt negatives Vorzeichen
        if (c < '0' || c > '9') return false;
    }
    return true;
}
    public static void main(String[] args) {
        // Prüfen, ob genau drei Argumente übergeben wurden
        if (args.length < 3) {
            System.out.println("ERROR: Weniger als drei Argumente übergeben");
            return;
        }

        // Eingabeparameter in Integer umwandeln (ohne try-catch)
        if (!istGanzeZahl(args[0]) || !istGanzeZahl(args[1]) || !istGanzeZahl(args[2])) {
            System.out.println("ERROR: Ungültige Eingabeparameter");
            return;
        }
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);

        // Fehlerbedingungen prüfen
        if (n < 1) {
            System.out.println("ERROR: n darf nicht kleiner als 1 sein");
            return;
        }
        if (min > max) {
            System.out.println("ERROR: min darf nicht größer als max sein");
            return;
        }
        if ((max - min) % n != 0) {
            System.out.println("ERROR: max - min ist nicht restlos durch n teilbar");
            return;
        }

        // Bin-Breite berechnen
        int binBreite = (max - min) / n;

        // Scanner für die Standardeingabe
        Scanner standardEingabe = new Scanner(System.in);
        String eingabeZeile = standardEingabe.nextLine();

        // Manuelles Aufteilen der Eingabezeile an Leerzeichen
        int spaceCount = 0;
        for (int i = 0; i < eingabeZeile.length(); i++) {
            if (eingabeZeile.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Erstelle ein Array für die Zahlen
        String[] zahlenString = new String[spaceCount + 1];
        int index = 0;
        String zahl = "";  // Leere Zeichenkette zur Speicherung der Zahl

        // Zeichenweise durch die Eingabezeile gehen und an Leerzeichen aufteilen
        for (int i = 0; i < eingabeZeile.length(); i++) {
            char c = eingabeZeile.charAt(i);
            if (c == ' ') {
                zahlenString[index] = zahl;
                index++;
                zahl = "";  // Zurücksetzen für die nächste Zahl
            } else {
                zahl = zahl + c;  // Zeichen zur Zahl hinzufügen
            }
        }
        zahlenString[index] = zahl;  // Letzte Zahl hinzufügen

        // Bins-Array für die Häufigkeitsverteilung
        int[] bins = new int[n];

        // Zahlen in die Bins einsortieren
        for (String zahlStr : zahlenString) {
            if (!istGanzeZahl(zahlStr)) {
                System.out.println("ERROR: Ungültige Eingabe in der Zahlenliste");
                return;
            }
            int zahlInt = Integer.parseInt(zahlStr);

            // Prüfen, ob die Zahl im gültigen Bereich liegt
            if (zahlInt < min || zahlInt > max) {
                System.out.println("ERROR: Zahl außerhalb des gültigen Bereichs");
                return;
            }

            // Bin bestimmen, in das die Zahl fällt
            int binIndex = (zahlInt - min) / binBreite;

            // Letzten Bin anpassen, damit die obere Grenze inklusive ist
            if (binIndex >= n) {
                binIndex = n - 1;
            }

            bins[binIndex]++;
        }

        // Ergebnis ausgeben
        for (int i = 0; i < n; i++) {
            System.out.print(bins[i] + " ");
        }
        System.out.println(); // Zeilenumbruch
    }
}



