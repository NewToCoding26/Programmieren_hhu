public class VL13_BouncingBall {
    public static void main(String[] args) {
        VL13_Ball[] balls = new VL13_Ball[10];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new VL13_Ball();
        }

        while (true) {
            for (VL13_Ball b: balls) {
                b.draw();
                b.move();
            }
            StdDraw.show(40);
            StdDraw.clear();
        }
    }
}
