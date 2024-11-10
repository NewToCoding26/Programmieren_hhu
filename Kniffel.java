import java.util.Arrays;

public class Kniffel {

    private static int sumForNumber(int[] dice, int number) {
        int sum = 0;
        for (int dices : dice) {
            if (dices == number) {
                sum += dices;
            }
        }
        return sum;
    }

    private static int aces(int[] dice) {
        return sumForNumber(dice, 1);
    }

    private static int twos(int[] dice) {
        return sumForNumber(dice, 2);
    }

    private static int threes(int[] dice) {
        return sumForNumber(dice, 3);
    }

    private static int fours(int[] dice) {
        return sumForNumber(dice, 4);
    }

    private static int fives(int[] dice) {
        return sumForNumber(dice, 5);
    }

    private static int sixes(int[] dice) {
        return sumForNumber(dice, 6);
    }

    private static int threeOfAKind(int[] dice) {
        for (int i = 0; i < dice.length - 2; i++) {
            if (dice[i] == dice[i + 1] && dice[i] == dice[i + 2]) {
                int sum = 0;
                for (int dices : dice) {
                    sum += dices;
                }
                return sum;
            }
        }
        return 0;
    }

    private static int fourOfAKind(int[] dice) {
        for (int i = 0; i < dice.length - 3; i++) {
            if (dice[i] == dice[i + 1] && dice[i] == dice[i + 2] && dice[i] == dice[i + 3]) {
                int sum = 0;
                for (int dices : dice) {
                    sum += dices;
                }
                return sum;
            }
        }
        return 0;
    }

    private static int fullHouse(int[] dice) {
        boolean threeOfKind = (dice[0] == dice[1] && dice[1] == dice[2] && dice[3] == dice[4] && dice[2] != dice[3]) ||
                              (dice[0] == dice[1] && dice[2] == dice[3] && dice[3] == dice[4] && dice[1] != dice[2]);
        return threeOfKind ? 25 : 0;
    }

    private static int smallStraight(int[] dice) {
        int[][] smallStraights = {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}};
        for (int[] straight : smallStraights) {
            if (containsSequence(dice, straight)) return 30;
        }
        return 0;
    }

    private static int largeStraight(int[] dice) {
        int[] largeStraight1 = {1, 2, 3, 4, 5};
        int[] largeStraight2 = {2, 3, 4, 5, 6};
        if (Arrays.equals(dice, largeStraight1) || Arrays.equals(dice, largeStraight2)) return 40;
        return 0;
    }

    private static int kniffel(int[] dice) {
        for (int i = 1; i < dice.length; i++) {
            if (dice[i] != dice[0]) return 0;
        }
        return 50;
    }

    private static int chance(int[] dice) {
        int sum = 0;
        for (int dices : dice) {
            sum += dices;
        }
        return sum;
    }

    private static boolean containsSequence(int[] dice, int[] sequence) {
        int matchCount = 0;
        for (int die : dice) {
            if (die == sequence[matchCount]) matchCount++;
            if (matchCount == sequence.length) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("ERROR: nicht genau 5 Zahlen übergeben");
            return;
        }

        int[] dice = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            dice[i] = Integer.parseInt(args[i]);
            if (dice[i] < 1 || dice[i] > 6) {
                System.out.println("Error: ungültige Augenzahl " + dice[i]);
                return;
            }
        }

        Arrays.sort(dice);

        System.out.println("Einser: " + aces(dice));
        System.out.println("Zweier: " + twos(dice));
        System.out.println("Dreier: " + threes(dice));
        System.out.println("Vierer: " + fours(dice));
        System.out.println("Fünfer: " + fives(dice));
        System.out.println("Sechser: " + sixes(dice));
        System.out.println("Dreierpasch: " + threeOfAKind(dice));
        System.out.println("Viererpasch: " + fourOfAKind(dice));
        System.out.println("Full House: " + fullHouse(dice));
        System.out.println("Kleine Straße: " + smallStraight(dice));
        System.out.println("Große Straße: " + largeStraight(dice));
        System.out.println("Kniffel: " + kniffel(dice));
        System.out.println("Chance: " + chance(dice));
    }
}


