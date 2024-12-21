public class VL6_ArrayBeispiele { 
    private static void printVector(int[] vector) {
        for (int number : vector) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 2D-Array matrix ausgeben
        for (int[] zeile : matrix) {
            printVector(zeile);
        }
        System.out.println();

        // Ergebnis-Matrix erstellen, die das Ergebnis von 2 * matrix enthält
        int skalar = 2;
        int[][] ergebnis = new int[matrix.length][matrix[0].length];

        for (int zeilennummer = 0; zeilennummer < matrix.length; zeilennummer++) {
            for (int spaltennummer = 0; spaltennummer < matrix[0].length; spaltennummer++) {
                ergebnis[zeilennummer][spaltennummer] = skalar * matrix[zeilennummer][spaltennummer];
            }
        }

        // 2D-Array ergebnis ausgeben
        for (int[] zeile : ergebnis) {
           printVector(zeile);
        }
    }
}
