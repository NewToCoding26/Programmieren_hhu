public class VL4_measuredValues {
    public static void main(String[] args) {
        double[] value = {20.5, 20.1, 19.5, 22.3}; 

        double sum = 0.0;
        for (int i = 0; i < value.length; i++) {
            sum = sum + value [i];
        }

        System.out.println(sum);

        double avg = sum / value.length;
        System.out.println(avg);
    }
}
