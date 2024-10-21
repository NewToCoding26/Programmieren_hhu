public class PQ {
    public static void main(String[] args) {
        if (args.length !=2) {
            System.out.println("ERROR: Genau zwei Argumente erwartet");
            return;
        }
        double p = Double.parseDouble(args[0]);
        double q = Double.parseDouble(args[1]);

        double wertUnterWurzel = (p*p) /4.0 - q;

        if (wertUnterWurzel < 0) {
            System.out.println("Es gibt 0 Nullstellen");
        }else if (wertUnterWurzel == 0) {
            double nullStelleBerechnen = -p / 2;
            System.out.println(nullStelleBerechnen);
            System.out.println("Es gibt nur eine Nullstelle");
        }else{
            double wurzelZiehen = Math.sqrt(wertUnterWurzel);
            double plus = -p / 2 + wurzelZiehen;
            double minus = -p / 2 - wurzelZiehen;
            System.out.println(plus);
            System.out.println(minus);
            System.out.println("Es gibt zwei Nullstellen");
        }
    }
}
