public class VL13_BouncingBall {
    public static void main(String[] args) {
        VL13_FlyingObject[] flyingObjects = new VL13_FlyingObject[8];

        for (int i = 0; i < flyingObjects.length; i+=2) {
            flyingObjects[i] = new VL13_Ball();
            flyingObjects[i+1] = new VL13_Square();

        }

        while (true) {
            for (VL13_FlyingObject fo: flyingObjects) {
                fo.draw();
                fo.move();
            }

            StdDraw.show(30);
            StdDraw.clear();
        }
    }
}
