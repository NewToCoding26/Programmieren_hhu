public class Lotto {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("ERROR: Nicht genau zwei Argumente übergeben");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        if (n < 1) {
            System.out.println("ERROR: Das erste Argument muss größer als 0 sein");
            return;
        }
        if (n > m) {
            System.out.println("ERROR: Das erste Argument muss kleiner oder gleich dem zweiten Argument sein");
            return;
        }

        for (int i = 0; i < n; i++) {
            int zahl = (int) (Math.random() * m) + 1;
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(zahl);
        }
    
    }
}
