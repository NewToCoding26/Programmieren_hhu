public class VL4_measuredValues {
    public static void main(String[] args) {
        double[] values = {20.5, 21.1, 21.3, 21.5, 20.1}; 

        double sum = 0.0;
        /* 
        for (int i = 0; i < value.length; i++) {
            sum = sum + value [i];
        }*/

        for (double value : values) {
            sum += value;
        }


        System.out.println(sum);

        double avg = sum / values.length;
        System.out.println(avg);
    }
}
