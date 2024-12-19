public class VL6_ArrayBeispiele {
    public static void main(String[] args) {
        int [] [] matrixA = {
                                { 1,  2,  3,  4},
                                { 5,  6,  7,  8},
                                { 9, 10, 11, 12}
                            };

     int c = 5;

     // Matrix mit c multiplizieren
     for (int rowIndex = 0; rowIndex < matrixA.length; rowIndex++) {
        for (int columnIndex = 0; columnIndex < matrixA[rowIndex].length;columnIndex++) {
            matrixA [rowIndex] [columnIndex] *=c;
        }
    }

    for (int [] row: matrixA) {
        for (int value: row) {
            System.out.println( value + " ");
        }
        System.out.println();
    }

    }
}
