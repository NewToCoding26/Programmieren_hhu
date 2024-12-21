public class Blatt5_Aufgabe1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("ERROR: NICHT GENAU ZWEI ARGUMENTE ÜBERGEBEN");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        if (n < 1 || n > m) {
            System.out.println("ERROR:⁢ Deine Lottoziehung ergibt keinen Sinn …");
            return;
        }

        int zahlenGezogeb[] = new int[n];

        boolean[] kugelGezogen = new boolean[m];
        
        for(int i = 0; i < n; i++) {
            int kugelNummer;
            do {
                kugelNummer = (int)(m * Math.random() + 1);
            } while(kugelGezogen[kugelNummer - 1]); 
            System.out.print(kugelNummer);
            kugelGezogen[kugelNummer - 1] = true;
            
            if(i != n - 1) {
                System.out.print(", ");
            }
        }

    }
}