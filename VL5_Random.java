public class VL5_Random {
    public static void main(String[] args) {
        double[] randomNumbers = new double[50];
        double sum = 0.0;

        for(int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = Math.random() * 20.0;
        }

        for (int i = 0; i < randomNumbers.length; i++) {
            sum += randomNumbers[i];
        }

        
        System.out.println(sum);

        double avg = sum / randomNumbers.length;
        System.out.println(avg); 

    }
}
