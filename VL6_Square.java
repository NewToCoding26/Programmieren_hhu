import java.util.Scanner;

public class VL6_Square {
    public static void main(String[] args) {
        
        Scanner standardInput = new Scanner (System.in);
        standardInput.close();


        while (standardInput.hasNext()) {
            double nextNumber = standardInput.nextDouble();
            System.out.println(nextNumber * nextNumber);
        }

    }
}