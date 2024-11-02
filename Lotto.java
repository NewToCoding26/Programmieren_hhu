public class Lotto {
    
    public static boolean istBereitsGezogen(int[] array, int länge, int zahl) {
        for (int i = 0; i < länge; i++) {
            if (array[i] == zahl) {
                return true;
            }
        }
        return false;
    }

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

        int[] gezogeneZahlen = new int[n];
        int count = 0;

        while (count < n) {
            int zahl = (int) (Math.random() * m) + 1;
            if (!istBereitsGezogen(gezogeneZahlen, count, zahl)) {
                gezogeneZahlen[count] = zahl;
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(gezogeneZahlen[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); 
    }
}

