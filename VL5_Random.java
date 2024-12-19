public class VL5_Random {
    public static void main(String[] args) {
        double[] randomNumbers = new double[5];
        double sum = 0.0;

        for(int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = Math.random() * 20.0;
        }

        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print("Index [" + i + "]: ");
            System.out.println(randomNumbers[i]);
        }

        // For-Each nur zum auslesen, wenn ich index nicht brauch und wenn ich nur über alles drüber laufen will

        for (double randomNumber : randomNumbers) {
            sum += randomNumber;
        }

        
        System.out.println(sum);

        double avg = sum / randomNumbers.length;
        System.out.println(avg); 

    }
}
