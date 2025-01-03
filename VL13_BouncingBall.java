public class VL13_BouncingBall {
    public static void main(String[] args) {
        VL19_FlyingObject[] flyingObject = new VL19_FlyingObject [8] ;

        for (int i = 0; i < flyingObject.length; i+=2) {
            flyingObject[i] = new VL19_Ball();
            flyingObject[i+1] = new VL13_Square();

        }

        System.out.println(flyingObject[0].toString());

        /* 
        while (true) {
            for (VL19_FlyingObject fo: flyingObjects) {
                fo.draw();
                fo.move();
            }

            StdDraw.show(30);
            StdDraw.clear();
        }
            */
    }
}
