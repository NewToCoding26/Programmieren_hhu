public class Blatt3_Aufgabe3 {
    public static void main(String[] args) {
        if( args.length < 1) {
            System.out.println("Error: Eine Zahl als argument mindestens übergeben!");
            return;
        }

        int min = Integer.parseInt(args[0]);
        int max = min;

        for(int i = 1; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);

            if(number > max) {
                max = number;
            }

            if ( number < min) {
                min = number;
            }
        }


        System.out.println(min);
        System.out.println(max);
    }
}
