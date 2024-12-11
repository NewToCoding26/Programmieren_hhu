public class VL3_D6 {
    public static void main (String []args) {

        int result;
        int numberOfRolls = 0;

        do {
            result = (int) (1 + 6 * Math.random());
            numberOfRolls++;
        } while ( result != 6);

        System.out.println("NumberofRolls = " + numberOfRolls);
    }
}
