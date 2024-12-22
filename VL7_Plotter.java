public class VL7_Plotter {
    private static double f(double x) {
        return Math.sin(x) * 2;
    }

    public static void main(String[] args) {
        StdDraw.setScale(-10, 10);
        StdDraw.setPenRadius(0.01);


        int numberOfPoints = 100;
        double[] x = new double[numberOfPoints];
        double[] y = new double[numberOfPoints];


        int from =-10;
        int to= 10;

        for(int i = 0; i< numberOfPoints; i++) {
            x[i] = from + (double) i * (to - from) / numberOfPoints;
            y[i] = f(x[i]);
        }

        for(int i = 0; i< numberOfPoints-1; i++) {
            StdDraw.line(x[i], y[i], x[i+1], y[i+1]);
        }

    }

}
