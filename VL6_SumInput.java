import java.util.Scanner;
import java.util.Locale;

public class VL6_SumInput {
    public static void main(String[] args) {
        
        Scanner standardInput = new Scanner (System.in);

        double sum = 0;

        while (standardInput.hasNext()) {
            double nextNumber = standardInput.nextDouble();
            sum += nextNumber;
        }

        System.out.println("Die Summe ist: " + sum);
    }
}