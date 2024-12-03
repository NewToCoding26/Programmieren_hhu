public class Search {

    private static int split(int[] haystack, int needle, int left, int right) {
        if (haystack[right] == haystack[left]) {
            return left; 
        }
        return left + (needle - haystack[left]) * (right - left) / (haystack[right] - haystack[left]);
    }

    private static int search(int[] haystack, int needle) {
        int left = 0;
        int right = haystack.length - 1;

        while (left <= right && needle >= haystack[left] && needle <= haystack[right]) {
            int pos = split(haystack, needle, left, right);

            if (haystack[pos] == needle) {
                return pos; 
            }

            if (haystack[pos] < needle) {
                left = pos + 1; 
            } else {
                right = pos - 1; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("-1");
            return;
        }

        int needle = Integer.parseInt(args[0]);

        int[] haystack = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            haystack[i - 1] = Integer.parseInt(args[i]);
        }

        System.out.println(search(haystack, needle));
    }
}

