public class VL10_Factorial {

    private static double Factorial (double n) {
        if (n == 0) {
            return 1;
        }
        return n * Factorial(n-1);
    }

    private static double Factorial_interativ (double n) {
        double result = 1;
        for(double i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Factorial_interativ(7));
        System.out.println(Factorial_interativ(40));
        System.out.println(Factorial_interativ(400));
    }
}
