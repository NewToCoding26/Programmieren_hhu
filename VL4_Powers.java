public class VL4_Powers {
    public static void main(String[] args) {
        int maxExponent = Integer.parseInt(args[0]);

        for (int currentExpoent = 0; currentExpoent < maxExponent; currentExpoent++) {
            System.out.print("2^" + currentExpoent + ": ");
            System.out.println((long) Math.pow(2, currentExpoent));
        }
    }
}
