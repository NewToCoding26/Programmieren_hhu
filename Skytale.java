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
        char[] result = new char[28];
        int index = 0;
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 4; i++) {
                result[index++] = raster[i][j];
            }
        }
        return new String(result);
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
        char[] result = new char[28];
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                result[index++] = raster[i][j];
            }
        }
        return new String(result);
    }

    private static String entschluesseln(String nachricht) {
        char[][] raster = spaltenweiseInRasterSchreiben(nachricht);
        return rasterZeilenweiseAblesen(raster);
    }

    private static String formatierenMitLeerzeichen(String nachricht, int[] gruppenGroessen) {
        char[] result = new char[nachricht.length() + gruppenGroessen.length - 1]; 
        int index = 0;
        int nachrichtIndex = 0;

        for (int i = 0; i < gruppenGroessen.length; i++) {
            int gruppe = gruppenGroessen[i];
            for (int j = 0; j < gruppe; j++) {
                result[index++] = nachricht.charAt(nachrichtIndex++);
            }
            if (i < gruppenGroessen.length - 1) {
                result[index++] = ' ';
            }
        }

        return new String(result);
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












