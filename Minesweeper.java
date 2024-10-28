public class Minesweeper {

    public static void main(String[] args) {
        // Prüfe, ob Feldgröße angegeben ist
        if (args.length < 2) {
            System.out.println("ERROR: Bitte Feldgröße angeben");
            return;
        }

        // Feldgröße einlesen
        int numberOfColumns = Integer.parseInt(args[0]);
        int numberOfRows = Integer.parseInt(args[1]);

        /*
         Q: Welcher Fehlerfall wird in den folgenden 6 Codezeilen behandelt?
         A: Es wird geprüft ob die erwartete Größe des Feldes, welche man herausbekommt indem man die angegeben Argumente von Zeile 
            und Spalte multipliziert, auch der tatsächlichen Größe des Feldes entspricht und wenn das nicht der Fall ist soll die
            Fehlermedung erscheinen von System.out.println().
         */
        int expectedNumberOfFields = numberOfColumns * numberOfRows;
        int numberOfFieldsGiven = args.length - 2;
        if (expectedNumberOfFields != numberOfFieldsGiven) {
            System.out.println("ERROR: " + expectedNumberOfFields + " Felder erwartet, aber " + numberOfFieldsGiven + " angegeben.");
            return;
        }

        // Eingabe in 2D-Array einlesen
        int[][] mines = new int[numberOfRows][numberOfColumns];
        int minenZähler = 0;

        for (int columnNumber = 0; columnNumber < numberOfColumns; columnNumber++) {
            for (int rowNumber = 0; rowNumber < numberOfRows; rowNumber++) {
                // berechne den Index, an dem das Element für die entsprechende Zeile/Spalte ist
                int index = rowNumber * numberOfColumns + columnNumber + 2;
                mines[rowNumber][columnNumber] = Integer.parseInt(args[index]);
                if (mines[rowNumber][columnNumber] == 1) {
                    minenZähler++;
                }
            }
        }

        // Wir müssen insgesamt 8 Felder um das aktuelle Feld an (x,y) betrachten.
        // Diese 8 Felder liegen an (x-1,y-1), (x-1,y+0) usw.
        // Die zu addierenden Terme (Offsets, also (-1, -1), (-1,+0) usw.) speichern wir in diesem Array.
        // (Alternativ kann man auch explizit 8 if-Abfragen formulieren.)
        int[][] offsets = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

        // 2D-Array für Nachbarschaftszahlen
        int[][] neighborhood = new int[numberOfRows][numberOfColumns];
        // Betrachte jedes Feld aus dem mines-Array:
        for (int columnNumber = 0; columnNumber < numberOfColumns; columnNumber++) {
            for (int rowNumber = 0; rowNumber < numberOfRows; rowNumber++) {
                if (mines[rowNumber][columnNumber] == 1) {
                    /*
                     Q: Welcher Sonderfall wird hier behandelt?
                     A: Falls die angegeben Spaltenzahl und ZeilenZahl 1 ergeben, dann ist es eine Mine und wir im neighborhood Array 
                        mit -1 angegeben.
                     */
                    neighborhood[rowNumber][columnNumber] = -1;
                } else {
                    int numberOfMinesInNeighborhood = 0;
                    // betrachte alle 8 benachbarten Felder mithilfe des Offset-Arrays
                    for (int[] offset: offsets) {
                        // berechne zu betrachtende Spalte/Zeile
                        int column = columnNumber + offset[0];
                        int row = rowNumber + offset[1];
                        /*
                         Q: Was prüft die folgende if-Abfrage (Zeile 64)? Was würde passieren, wenn sie fehlt?
                         A: Die if abfrage Prüft, ob eine numberOfMinesInNeighberhood außerhalb des Spielfeldes liegt. Wenn diese if Ab-
                            frage fehlen würde, würde der code auf ungültige Positionen zuggreifen und es würde eine Fehlermedlung er-
                            scheinen.
                         */
                        if (column >= 0 && column < numberOfColumns && row >= 0 && row < numberOfRows) { // Zeile 64
                            // 
                            if (mines[row][column] == 1) {
                                numberOfMinesInNeighborhood += 1;
                            }
                        }
                    }
                    // speichere berechnete Anzahl
                    neighborhood[rowNumber][columnNumber] = numberOfMinesInNeighborhood;
                }
            }
        }

        for (int[]row : neighborhood) {
            for (int number : row) {
                if (number == -1) {
                    System.out.print("* ");
                } else if (number == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }
        System.out.println(numberOfColumns * numberOfRows + " fields, " + minenZähler + " mines");
    }
}
