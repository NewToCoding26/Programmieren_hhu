public class Chess {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("ERROR: Bitte die Größe des Feldes als Argument übergeben!");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if (n <= 0) {
            System.out.println("ERROR: '" + n + "' ist keine positive ganze Zahl.");
            return;
        }

        for (int zeile = 0; zeile < n; zeile++) {
            for (int spalte = 0; spalte < n; spalte++) {
                if ((zeile + spalte) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



