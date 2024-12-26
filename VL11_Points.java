public class VL11_Points {

    public static void main(String[] args) {
        VL11_Punkt2D p1 = new VL11_Punkt2D(0.3, 2.6);
        System.out.println(p1.getX());

        p1.print();

        VL11_Punkt2D p2 = new VL11_Punkt2D(1.8, 0.3);
        p1.subtract(p2);

        p1.print();

        String bla = "hello";
        String bla2 = bla.toUpperCase();
        System.out.println(bla);
        System.out.println(bla2);

        p1.setX(1/0.0);

        p1.print();

        System.out.println(p1);
        System.out.println(p1.toString());

        VL11_Punkt2D p3 = new VL11_Punkt2D(1.8, 0.3);
        
        System.out.println(p2 == p3);
        System.out.println(p2.equals(p3));

    }

    
}
