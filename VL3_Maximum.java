public class VL3_Maximum {
    public static void main (String []args) {
        double firstNumber = Double.parseDouble(args[0]);
        double secondNumber = Double.parseDouble(args[1]);

        double maximum = 0;
        double minimum = 0;

        if (firstNumber > secondNumber) {
            maximum = firstNumber;
            minimum = secondNumber;
        }else {
            maximum = secondNumber;
            minimum = firstNumber;
        }

        System.out.println("Maximum = " + maximum);
        System.out.print("Minimum = " + minimum);
    }
}
