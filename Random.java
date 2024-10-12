public class Random {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        int zufallsZahl = min + (int) (Math.random() * (max - min +1));
        System.out.println(zufallsZahl);
    }
}
