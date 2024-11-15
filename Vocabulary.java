import java.util.Scanner;

public class Vocabulary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split(",");

            if (words.length == 2) {
                String swedish = removeLeadingAndTrailingSpaces(words[0]);
                String german = removeLeadingAndTrailingSpaces(words[1]);

                String shuffledGerman = shuffleString(german);
                System.out.println(swedish + " " + shuffledGerman);
            }
        }
        scanner.close();
    }

    public static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        String shuffled;

        do {
            for (int i = 0; i < characters.length; i++) {
                int randomIndex = (int) (Math.random() * characters.length);

                char temp = characters[i];
                characters[i] = characters[randomIndex];
                characters[randomIndex] = temp;
            }
            shuffled = new String(characters);
        } while (shuffled.equals(input)); 

        return shuffled;
    }

    public static String removeLeadingAndTrailingSpaces(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start <= end && input.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && input.charAt(end) == ' ') {
            end--;
        }

        return input.substring(start, end + 1);
    }
}

