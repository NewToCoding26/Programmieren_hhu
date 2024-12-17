public class Blatt3_Aufgabe5 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("ERROR; GENAU ZWEI ARGUMENTE ÜBERGEBEN");
            return;
        }

        double p = Double.parseDouble(args[0]);
        double q = Double.parseDouble(args[1]);

        double formelNegativ =  -p/2 - Math.sqrt((p*p) / 4 - p);
        double formelPositv =  -p/2 + Math.sqrt((p*p) / 4 - p);

        System.out.println(formelNegativ);
        System.out.println(formelPositv);
    }
}
