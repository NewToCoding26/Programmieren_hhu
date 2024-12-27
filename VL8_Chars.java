public class VL8_Chars {
    public static void main(String[] args) {
        char myChar = '*';
        System.out.println(myChar);

        String helloWorld = "hello World";
        System.out.println(helloWorld);

        System.out.println(helloWorld.charAt(1));

        char allChars[] = helloWorld.toCharArray();
        System.out.println(allChars[0]);

        for (char letter: allChars) {
            System.out.print(letter);
        }
        System.out.println();

        char letter = 'A';
        System.out.println((char) letter + 1);
        System.out.println(letter + 1);
        System.out.println((int) letter);

    }
}
