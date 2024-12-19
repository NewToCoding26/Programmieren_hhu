public class VL5_ArgsSumProduct {
    public static void main(String[] args) {
        double [] numbers = new double [args.length];
        for(int i = 0; i < args.length;i++) {
            numbers [i] =  Double.parseDouble(args[i]);
        }
        double sum = 0;
        for (double number: numbers) {
            sum += number;
        }
        double product = 1;
        for (double number: numbers) {
            product *= number;
        }

        System.out.println("Summe " + sum + ", Produkt: " + product);
    }
}