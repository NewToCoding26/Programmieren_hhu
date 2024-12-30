public class VL16_Sort {

    //Oeffentliche Einstiegsfunktion
    public static void mergeSort(int[] numbers) {
        mergeSort(numbers, 0, numbers.length);
    }
    
    //rekursive Funktion, die sortiert
    private static void mergeSort(int[] numbers, int startIndex, int endIndex) {
        int size = endIndex - startIndex;
        int middleIndex = startIndex + (size) / 2;

        if (size <= 1) {
            return;
        }

        // 1. Haelfte sortieren
        mergeSort(numbers, startIndex, middleIndex);

        // 2. Haelfte sortieren
        mergeSort(numbers, middleIndex, endIndex);

        //Sortierte Haelften zusammenfuegen
        merge(numbers, startIndex, middleIndex, endIndex);
    }

    private static void print(int[] numbers) {
        for(int number: numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void merge(int[] numbers, int startIndex, int middleIndex, int endIndex) {
        int indexA = startIndex;
        int indexB = middleIndex;
        int[] merged = new int[endIndex - startIndex]; 
        int indexMerged = 0;


        while (indexA < middleIndex || indexB < endIndex) {
            // Teilbereich links abgearbeitet, naechstes Element von B kopieren
            if (indexA == middleIndex) {
                merged[indexMerged] = numbers[indexB];
                indexB++;
            }
            //Teilbereich rechts abgearbeitet, naechstes Element von A kopieren
            else if (indexB == endIndex) {
                merged[indexMerged] = numbers[indexA];
                indexA++;
            }
            else if (numbers[indexB] <= numbers[indexA]) {
                merged[indexMerged] = numbers[indexB];
                indexB++;
            }
            else if (numbers[indexA] <= numbers[indexB]) {
                merged[indexMerged] = numbers[indexA];
                indexA++;
            }
            indexMerged++;
        }

        // Kopiere merged nach Original-Array
        for(int i = 0; i < merged.length; i++) {
            numbers[startIndex + i] = merged[i];
        }
    }

    public static void main(String[] args) {

        for (int size = 1_000; size < 1_100_000; size += 1_0_000) {
            int[] numbers = new int[size];
            for(int i = 0; i < numbers.length; i++) {
                numbers[i] = (int) (Math.random() * size);
            }

            long start = System.currentTimeMillis();

            mergeSort(numbers);

            long end = System.currentTimeMillis();

            System.out.print(size);
            System.out.print(";");
            System.out.println(end - start);
        }
    }
}

