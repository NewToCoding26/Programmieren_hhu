import java.util.Scanner;
import java.util.Locale;

public class VL6_Square {
    public static void main(String[] args) {
        
        Scanner standardInput = new Scanner (System.in);


        while (standardInput.hasNext()) {
            double nextNumber = standardInput.nextDouble();
            System.out.println(nextNumber * nextNumber);
        }

    }
}