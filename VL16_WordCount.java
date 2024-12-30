import java.util.Scanner;
import java.util.Arrays;

public class VL16_WordCount {

    private static void print(String[] words) {
        for(String word: words) {
            System.out.print(word + ";");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner (System.in);

        String[] words = stdin.nextLine().split(",");

        print(words);

        Arrays.sort(words);

        print(words);

        count(words);
    }

    private static void count (String[] words) {
        if (words.length == 0) {
            System.out.println("Keine woerter zum zaehlen");
            return;
        }

        String currentWord = words[0];
        int count = 1;

        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(currentWord)) {
                count++;
            } else {
                System.out.println(currentWord + ": " + count);
                currentWord = words[i];
                count = 1;
            }
        }
        System.out.println(currentWord + ": " + count);
    }
}
