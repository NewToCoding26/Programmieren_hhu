public class Blatt3_Aufgabe5 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("ERROR; GENAU ZWEI ARGUMENTE ÜBERGEBEN");
            return;
        }

        double p = Double.parseDouble(args[0]);
        double q = Double.parseDouble(args[1]);

        double unterWurzel = p * p / 4 - q;

        if (unterWurzel < 0) {
            System.out.println("ERROR: KEINE NULLSTELLEN");
        } else if (unterWurzel < 0.0000001) {
            System.out.println(-p / 2);
            System.out.println("Es gibt eine Nullstelle");
        } else {
            System.out.println(-p / 2 - Math.sqrt(unterWurzel));
            System.out.println(-p / 2 + Math.sqrt(unterWurzel));
            System.out.println("Es gibt zwei Nullstellen");
        }
    }
}
