public class PascalTriangle {

    private static int pascalRecursive(int zeile, int spalte) {
        if (spalte == 0 || spalte == zeile) {
            return 1;
        }
        return pascalRecursive(zeile - 1, spalte - 1) + pascalRecursive(zeile - 1, spalte);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Bitte geben Sie genau eine Zahl als Argument an.");
            return;
        }

        if (!isNumeric(args[0])) {
            System.out.println("Bitte geben Sie eine gültige Zahl als Argument ein.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if (n < 0) {
            System.out.println("Bitte geben Sie eine nicht-negative Zahl ein.");
            return;
        }

        for (int zeile = 0; zeile <= n; zeile++) {
            for (int spalte = 0; spalte <= zeile; spalte++) {
                System.out.print(pascalRecursive(zeile, spalte) + " ");
            }
            System.out.println(); 
        }
    }

    private static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return str.length() > 0;
    }
}



