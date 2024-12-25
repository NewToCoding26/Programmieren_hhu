import java.util.Scanner;

public class VL9_Wordcounter {
    public static void main(String[] args) {
        Scanner stdin = new Scanner (System.in);
        int wordsSoFar = 0;

        while(stdin.hasNext()) {
            String line = stdin.nextLine();
            String[] words = line.split(" ");
            int wordsInLine = words.length;
            wordsSoFar += wordsInLine;
        }

        System.out.println(wordsSoFar + " Wörter gezählt.");
    }
}
