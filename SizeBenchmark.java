
import java.util.Scanner;
import java.util.ArrayList;

// Bestimme, wie lange die Suche nach einem zufälligen Element bei unterschiedlicher Anzahl von Elementen dauert
public class SizeBenchmark {

    private static final int NUMBER_OF_NAMES = 194253;

    private static String[] readNames() {
        Scanner stdin = new Scanner(System.in);
        String[] names = new String[NUMBER_OF_NAMES];
        
        int i = 0;
        while(stdin.hasNext()) {
            names[i] = stdin.nextLine();
            i++;
        }
        
        System.out.println("eingelesen!");
        
        return names;
    }

    public static void main(String[] args) {
        String[] allNames = readNames();
        
        for(int size = 1_000; size < NUMBER_OF_NAMES; size *= 2) {
//             List<String> names = new List<>();
//             BinarySearchTree<String> names = new BinarySearchTree<>();
            GenericHashSet<String> names = new GenericHashSet<>();
            for(int i = 0; i < size; i++) {
                names.insert(allNames[i]);
            }
//             System.out.println("eingefügt!");
        
            long start = System.currentTimeMillis();
            
//             int numberOfSearches = 1_000;
//             int numberOfSearches = 1_000_000;
            int numberOfSearches = 10_000;
            for(int i = 0; i < numberOfSearches; i++) {
                String randomName = allNames[(int)(Math.random() * size)];
                names.contains(randomName);
            }
            
            long end = System.currentTimeMillis();
            
            System.out.print(size + ",");
            System.out.println((end - start) / (double)numberOfSearches);
        }
    
    }

}
