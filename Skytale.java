public class Skytale {

    private static char[][] zeilenweiseInRasterSchreiben(String nachricht) {
        char[][] raster = new char[4][7];
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                raster[i][j] = nachricht.charAt(index++);
            }
        }
        return raster;
    }

    private static String rasterSpaltenweiseAblesen(char[][] raster) {
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 4; i++) {
                result.append(raster[i][j]);
            }
        }
        return result.toString();
    }

    private static String verschluesseln(String nachricht) {
        char[][] raster = zeilenweiseInRasterSchreiben(nachricht);
        return rasterSpaltenweiseAblesen(raster);
    }

    private static char[][] spaltenweiseInRasterSchreiben(String nachricht) {
        char[][] raster = new char[4][7];
        int index = 0;
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 4; i++) {
                raster[i][j] = nachricht.charAt(index++);
            }
        }
        return raster;
    }

    private static String rasterZeilenweiseAblesen(char[][] raster) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                result.append(raster[i][j]);
            }
        }
        return result.toString();
    }

    private static String entschluesseln(String nachricht) {
        char[][] raster = spaltenweiseInRasterSchreiben(nachricht);
        return rasterZeilenweiseAblesen(raster);
    }

    private static String formatierenMitLeerzeichen(String nachricht, int[] gruppenGroessen) {
        StringBuilder result = new StringBuilder();
        int index = 0;

        for (int gruppe : gruppenGroessen) {
            if (index + gruppe > nachricht.length()) {
                throw new IllegalArgumentException("Ungültige Gruppengröße oder Nachricht zu kurz.");
            }
            result.append(nachricht, index, index + gruppe);
            index += gruppe;
            if (index < nachricht.length()) {
                result.append(' '); // Leerzeichen nur zwischen Gruppen einfügen
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("ERROR");
            return;
        }

        String modus = args[0];
        String nachricht = args[1];

        if (nachricht.length() != 28) { 
            System.out.println("ERROR");
            return;
        }

        if (modus.equals("E")) {
            String verschluesselteNachricht = verschluesseln(nachricht);
            int[] gruppenGroessen = {14, 14}; 
            System.out.println(formatierenMitLeerzeichen(verschluesselteNachricht, gruppenGroessen));
        } else if (modus.equals("D")) {
            String entschluesselteNachricht = entschluesseln(nachricht);
            int[] gruppenGroessen = {3, 7, 7, 7, 4}; 
            System.out.println(formatierenMitLeerzeichen(entschluesselteNachricht, gruppenGroessen));
        } else {
            System.out.println("ERROR");
        }
    }
}













