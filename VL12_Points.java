public class VL12_Points {
    
        private static VL12_Point moveX(VL12_Point point, double xOffset) {
        return new VL12_Point(point.getX() + xOffset, point.getY());
    } 

    public static void main(String[] args) {
        VL12_Point position1 = new VL12_Point(10, 20);
        VL12_Point position2 = new VL12_Point(30, 24);

        System.out.println(position1.getX());
        System.out.println(position1.getY());

        System.out.println(position1);
        System.out.println(position2);

        VL12_Point position3 = position1.subtract(position2);
        System.out.println("Position1: " + position1);
        System.out.println("Position3: " + position3);

        System.out.println("Radius von Position 1: " + position1.radius());
        System.out.println("Winkel von Position 1: " + position1.theta());

    }
}
