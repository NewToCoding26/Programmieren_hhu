public class VL19_BoucingShapes {
    
    public static void main(String[] args) {
        VL13_FlyingObject[] flyingObjects = new VL13_FlyingObject[20];
        for(int i = 0; i < flyingObjects.length / 2; i++) {
            flyingObjects[i * 2 + 1] = new VL13_Square();
            flyingObjects[i * 2] = new VL13_Ball();
        }

        while (true) {
            for(VL13_FlyingObject flyingObject: flyingObjects) {
                flyingObject.move();
                flyingObject.draw();
            }
            StdDraw.show(25);
            StdDraw.clear();

        }


    }
}
