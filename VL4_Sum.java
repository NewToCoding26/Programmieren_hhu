public class VL4_Sum {
    public static void main(String[] args) {
        int lastNumber = Integer.parseInt(args[0]);
        int partialSum = 0; 

        for (int currenNumber = 0; currenNumber <= lastNumber; currenNumber++) {
            partialSum += currenNumber;

        }
        System.out.println(partialSum);
    }
}
