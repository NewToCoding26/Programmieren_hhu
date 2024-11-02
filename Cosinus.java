public class Cosinus {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("ERROR: Bitte ein Argument eingeben");
            return;
        }
        
        double x = Double.parseDouble(args[0]);

        double taylorEntwicklung = 1 - x * x / 2 * 1 + x * x /  4 * 3 * 2 * 1 - x * x / 6 * 5 * 4 * 3 * 2 * 1 + x * x / 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 - x * x / 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 + x * x / 12 * 11 * 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 - x * x / 14 * 13 * 12 * 11 * 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 + x * x / 16 * 15 * 14 * 13 * 12 * 11 * 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 - x * x / 18 * 17 * 16 * 15 * 14 * 13 * 12 * 11 * 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 + x * x / 20 * 19 * 18 * 17 * 16 * 15 * 14 * 13 * 12 * 11 * 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1;
        
        System.out.println(taylorEntwicklung);
    }
}
