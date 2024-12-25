public class VL10_Shuffle {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        printArray(numbers);
        shuffle(numbers);  
//      printArray(shuffled(numbers));
        printArray(numbers);
    }

    private static void shuffle(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int randomIndex = i + (int) (Math.random() * (array.length - i));
            int cache = array[randomIndex];
            array[randomIndex] = array[i];
            array[i] = cache;
        }
    }

    /* 
    private static int[] shuffled (int[] array) {
        int[] newArray = new int[array.length] ;
        for (int i = 0; i < array.length;i++){
            newArray[i] = array[i];
        }
        shuffle(newArray);
        return newArray;
    } */

    private static void printArray (int[] array) {
        for(int value: array) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}
