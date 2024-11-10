import java.util.Scanner;

public class Histogram {

    private static boolean istGanzeZahl(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == 0 && c == '-') {
                continue;
            }
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("ERROR: Weniger als drei Argumente übergeben");
            return;
        }

        if (!istGanzeZahl(args[0]) || !istGanzeZahl(args[1]) || !istGanzeZahl(args[2])) {
            System.out.println("ERROR: Ungültige Eingabeparameter");
            return;
        }

        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);

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

        int binBreite = (max - min) / n;

        Scanner standardEingabe = new Scanner(System.in);
        String eingabeZeile = standardEingabe.nextLine();
        standardEingabe.close();

        int spaceCount = 0;
        for (int i = 0; i < eingabeZeile.length(); i++) {
            if (eingabeZeile.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] zahlenString = new String[spaceCount + 1];
        int index = 0;
        String zahl = "";

        for (int i = 0; i < eingabeZeile.length(); i++) {
            char c = eingabeZeile.charAt(i);
            if (c == ' ') {
                zahlenString[index] = zahl;
                index++;
                zahl = "";
            } else {
                zahl = zahl + c;
            }
        }
        zahlenString[index] = zahl;

        int[] bins = new int[n];

        for (String zahlStr : zahlenString) {
            if (!istGanzeZahl(zahlStr)) {
                System.out.println("ERROR: Ungültige Eingabe in der Zahlenliste");
                return;
            }
            int zahlInt = Integer.parseInt(zahlStr);

            if (zahlInt < min || zahlInt > max) {
                System.out.println("ERROR: Zahl außerhalb des gültigen Bereichs");
                return;
            }

            int binIndex = (zahlInt - min) / binBreite;

            if (binIndex >= n) {
                binIndex = n - 1;
            }

            bins[binIndex]++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(bins[i] + " ");
        }
        System.out.println();
    }
}




