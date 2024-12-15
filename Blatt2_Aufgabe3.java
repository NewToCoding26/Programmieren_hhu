public class Blatt2_Aufgabe3 {
    public static void main(String[] args) {
        
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        int Zufallszahl = (int) (Math.random() * (max - min + 1) + min);

        System.out.println(Zufallszahl);
    }
}
