public class VL12_Points {

    public static void main(String[] args) {
        VL12_CatesianPoint position1 = new VL12_CatesianPoint(10, 60);
        VL12_PolarPoint position2 = new VL12_PolarPoint(1, 0);
        System.out.println(position1);
        System.out.println(position2);

        VL12_PointInterfaces position3 = position1.subtract(position2);
        System.out.println(position3);
    }
}
