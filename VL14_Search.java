import java.util.stream.IntStream;

public class VL14_Search {

    private static int binarySearch(int[] haystack, int needle) {
        int leftIndex = 0;
        int rightIndex = haystack.length - 1;

        while (leftIndex <= rightIndex) {
            int currentIndex = (leftIndex + rightIndex) / 2;
            int currentElement = haystack[currentIndex];

            if (currentElement == needle) {
                return currentIndex;
            } else if (currentElement < needle) {
                leftIndex = currentIndex + 1;
            } else {
                rightIndex = currentIndex - 1;
            }
        }
        return -1;
    }

    // gib den Index des gesuchten Elements 'needle' zurück
    public static int search(int[] haystack, int needle) {
        for (int currentIndex = 0; currentIndex < haystack.length; currentIndex++) {
            if (haystack[currentIndex] == needle) {
                return currentIndex;
            }
        }
        // Hier landen wir nur, wenn wir needle nicht im Haystack gefunden haben
        return -1;
    }

    private static int[] bigArray(int size) {
        int[] haystack = new int[size];
        long start = System.currentTimeMillis();
        for (int i = 0; i < haystack.length; i++) {
            haystack[i] = i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Zeit fuer anlegen des Arrays: " + (end - start) + "ms");
        return haystack;
    }

    public static void main(String[] args) {
        int pos;
        long start, end, linearFinished;

        for (int size = 1_000_000; size <= 10_000_000; size += 1_000_000) {
            int[] numbers = IntStream.rangeClosed(0, size - 1).toArray();

            // Lineare Suche
            start = System.currentTimeMillis();
            for (int i = 0; i < 20; i++) {
                pos = search(numbers, numbers.length - 1); // Suche nach dem letzten Element
            }
            linearFinished = System.currentTimeMillis();

            // Binäre Suche
            for (int i = 0; i < 1_000_000; i++) {
                pos = binarySearch(numbers, numbers.length - 1);
            }
            end = System.currentTimeMillis();

            // Ergebnisse ausgeben
            System.out.print(numbers.length);
            System.out.print(", ");
            System.out.print((linearFinished - start) / 20.0); // Durchschnittliche Zeit für lineare Suche
            System.out.print(", ");
            System.out.println((end - linearFinished) / 1_000_000.0); // Durchschnittliche Zeit für binäre Suche
        }
    }
}

