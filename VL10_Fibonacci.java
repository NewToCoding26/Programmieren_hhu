public class VL10_Fibonacci {

    private static int F(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        return F (n - 1) + F(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(F_iterativ(2));
        System.out.println(F_iterativ(7));
        System.out.println(F_iterativ(45));
    }

    private static int F_iterativ(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int lastFibonacci = 1;
        int secondLastFibonacci = 0;
        for (int i = 2; i<=n;i++) {
            int nextFibonacci = lastFibonacci + secondLastFibonacci;
            secondLastFibonacci = lastFibonacci;
            lastFibonacci = nextFibonacci;
        }
        return lastFibonacci;
    }
}
