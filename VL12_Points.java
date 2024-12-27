public class VL12_Points {

    public static void main(String[] args) {
        VL12_PointInterfaces position = new VL12_PolarPoint(Math.sqrt(2), Math.PI/ 4);

        if (position instanceof VL12_CatesianPoint) {
            System.out.println(((VL12_CatesianPoint) position).getTheta());
        }
    }
}
