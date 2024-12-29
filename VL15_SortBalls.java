public class VL15_SortBalls {
    private static void sort (VL13_Ball[] balls) {
        for (int currentIndex = 0; currentIndex < balls.length; currentIndex++) {
            VL13_Ball currentBall = balls[currentIndex];
            int insertionPosition = currentIndex;
            while (insertionPosition > 0 && balls[insertionPosition - 1].getRadius() > currentBall.getRadius()) {
                balls[insertionPosition] = balls[insertionPosition - 1];
                insertionPosition--;
            }
            balls[insertionPosition] = currentBall;
        }
    }

    private static void print(VL15_SortBalls[] balls) {
        for(VL15_SortBalls ball: balls) {
            System.out.print(balls);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        VL15_SortBalls balls = {
            new VL15_SortBalls(), new VL15_SortBalls(), new VL15_SortBalls(), new VL15_SortBalls()
        };

        System.out.println("Unsortiert");
        print(balls);

        sort(balls);

        System.out.println("Sortiert");
        print(balls);
    }
}
