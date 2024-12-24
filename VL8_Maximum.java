public class VL8_Maximum {

    private static double maximum(double a, double b) {
        System.out.println("maximum (double, double)");

        if (a > b) {
            return a;
        }
            return b;
    }

    private static double maximum(double a, double b, double c) {
        System.out.println("maximum (double, double)");

        if (a > b) {
            return maximum(a, c);
        } 
        return maximum(b, c);
    }

    public static void main(String[] args) {
        System.out.println(maximum(24.3, 24.1, 24.5));
    }
        
    
}
