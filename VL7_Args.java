public class VL7_Args {
    private static void main (String[] args) {
        int [] numbers = new int [args.length];

        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        for (int number: numbers) {
            System.out.println(number + " ");
        }
        System.out.println();
    }
}
