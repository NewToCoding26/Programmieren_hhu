public class VL13_BouncingBall {
    public static void main(String[] args) {
        VL19_FlyingObject[] flyingObjects = new VL19_FlyingObject [2] ;

        for (int i = 0; i < flyingObjects.length; i+=2) {
            flyingObjects[i] = new VL19_Ball();
            flyingObjects[i+1] = new VL13_Square();

        }

        System.out.println(flyingObjects[0].toString());

        while (true) {
            for (VL19_FlyingObject fo: flyingObjects) {
                fo.draw();
                fo.move();
            }

            StdDraw.show(30);
            StdDraw.clear();
        }
            
    }
}
