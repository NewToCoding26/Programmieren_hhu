public class Blatt3_Aufgabe4 {
    public static void main(String[] args) {
        if ( args.length < 1 ) {
            System.out.println("ERROR: FALSCHE EINGABE");
            return;
        }

        int chess = Integer.parseInt(args[0]);

        if(chess < 0) {
            System.out.println("ERROR: KEINE NEGATIVEN ZAHLEN");
        }

        for (int zeilenIndex = 0; zeilenIndex < chess; zeilenIndex++) {
            for (int spaltenIndex = 0; spaltenIndex < chess; spaltenIndex++) {
                if ((zeilenIndex + spaltenIndex) % 2 == 0)  {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
