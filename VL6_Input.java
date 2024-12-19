import java.util.Scanner;

public class VL6_Input {
    public static void main(String[] args) {
        
        Scanner standardInput = new Scanner (System.in);
        standardInput.close();

        System.out.print("Bitte eine Zahl eingeben: ");
        int Zahl = standardInput.nextInt();
        System.out.println("Die eingegebene Zahl ist: " + Zahl);
    }
}