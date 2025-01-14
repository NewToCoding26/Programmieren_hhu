public class Matrix {

    private int[][] data;

    public Matrix(int[][] input) {
        if (input == null || !isRectangular(input)) {
            throw new IllegalArgumentException("Ungültige Matrix");
        }
        this.data = copyMatrix(input);
    }

    private boolean isRectangular(int[][] matrix) {
        int columnCount = matrix[0].length;
        for (int[] row : matrix) {
            if (row == null || row.length != columnCount) {
                return false;
            }
        }
        return true;
    }

    private int[][] copyMatrix(int[][] matrix) {
        int[][] copy = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, copy[i], 0, matrix[i].length);
        }
        return copy;
    }

    public int get(int row, int column) {
        if (row < 0 || row >= data.length || column < 0 || column >= data[0].length) {
            throw new IndexOutOfBoundsException("Ungültiger Index");
        }
        return data[row][column];
    }

    public Matrix multiply(Matrix other) {
        if (other == null) {
            throw new IllegalArgumentException("Matrix darf nicht null sein");
        }
        if (this.data[0].length != other.data.length) {
            throw new IllegalArgumentException("Dimensionen nicht kompatibel für die Multiplikation");
        }

        int[][] result = new int[this.data.length][other.data[0].length];
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < other.data[0].length; j++) {
                for (int k = 0; k < this.data[0].length; k++) {
                    result[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return new Matrix(result);
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 7, 8},
            {2, 6, 5, 3}
        };

        int[][] matrix2 = {
            {2, 8, 9},
            {1, 12, 15},
            {42, 3, 6},
            {50, 21, 4}
        };

        Matrix m1 = new Matrix(matrix1);
        Matrix m2 = new Matrix(matrix2);

        Matrix result = m1.multiply(m2);

        for (int i = 0; i < result.data.length; i++) {
            for (int j = 0; j < result.data[i].length; j++) {
                System.out.print(result.get(i, j) + " ");
            }
            System.out.println();
        }
    }
}

