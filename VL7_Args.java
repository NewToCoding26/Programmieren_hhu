public class VL7_Args {

    private static int[] argsToInt (String[] array) {
        int [] numbers = new int [array.length];

        for (int i = 0; i < array.length; i++) {
            numbers[i] = Integer.parseInt(array[i]);
        }
        return numbers;
    }

    private static void printVector(int[] vector) {
        for (int number : vector) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main (String[] args) {

        int[] numbers = argsToInt(args);
        
        printVector(numbers);
    }
}
