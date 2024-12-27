public class VL10_Sum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        System.out.println(sum(a));
        System.out.println(" ");
        System.out.println(sum(b));
    }

    private static int sum (int[] array) {
        int result = 0;
        for(int element: array) {
            result += element;
        }
        return result;
    }
}
