import java.util.Scanner;

public class AbgabenZähler {
    public static void main(String[] args) {
        int countFaruh = 0;

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String zeile = scanner.nextLine();
            
            if (endsWith(zeile, "-faruh")) {
                countFaruh++;
            }
        }

        System.out.println("Anzahl der Abgaben von faruh: " + countFaruh);

        scanner.close();
    }

    public static boolean endsWith(String str, String endung) {
        if (endung.length() > str.length()) {
            return false;
        }

        for (int i = 0; i < endung.length(); i++) {
            if (str.charAt(str.length() - endung.length() + i) != endung.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}


