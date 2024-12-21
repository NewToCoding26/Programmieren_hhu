public class VL7_Max {

    private static int absmax (int a, int b) {
        int ergebnis;

        System.out.println("Bestimme absmax (" + a +", " + b + ")");

        if (Math.abs(a) > Math.abs(b)) {
            ergebnis = Math.abs(a);
        } else {
            ergebnis = Math.abs(b);
        }

        a = 0;
        b = 0;
        return ergebnis;
    }

    public static void main(String[] args) {
        int x = -5;
        int y = 20;
        System.out.println(absmax(x, y));
         
        int a = 123;
        int b = -7;
        System.out.println(absmax(a, b));

        System.out.println(a);
        System.out.println(b);
        
    } 
}
