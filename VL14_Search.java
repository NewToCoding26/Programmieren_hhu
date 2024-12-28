public class VL14_Search {
    public static int search (int[] haystack, int needle) {
        for(int currentIndex = 0; currentIndex < haystack.length; currentIndex++) {
            if (haystack[currentIndex] == needle) {
                return currentIndex;
            }
        }
        return -1;
    }

        public static void main (String[] args) {
            int[] haystack = {-27, -18, 1, 5, 15, 100, 599};

            int s = 5;
            int pos = search(haystack, s);
            System.out.println(pos);

            /* 
            System.out.print("Gesucht = " + s + ", " );
            if (pos < 0) {
                System.out.println("nicht gefunden.");
            }else {
                System.out.println("gefunden bei Index = " + pos);
            }  */
        }
    }
