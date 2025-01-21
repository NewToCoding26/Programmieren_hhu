
import java.util.Scanner;

public class Benchmark {

    public static void main(String[] args) {
    
        Scanner stdin = new Scanner(System.in);
        
//         int numberOfSearches = 1_000;
        int numberOfSearches = 10_000_000;
//         List<String> names = new List<>();
//         BinarySearchTree<String> names = new BinarySearchTree<>();
        GenericHashSet<String> names = new GenericHashSet<>();
        
        while(stdin.hasNext()) {
            names.insert(stdin.nextLine());
        }
        System.out.println("eingelesen!");
        
        long start = System.currentTimeMillis();
        
        for(int i = 0; i < numberOfSearches; i++) {
            names.contains("Brandt Katinka");
        }
        
        long end = System.currentTimeMillis();
        
        System.out.println(end - start);
    
    }

}
