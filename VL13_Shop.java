import java.awt.Color;

public class VL13_Shop {
    
    public static void main(String[] args) {
        VL13_Fahrrad rad = new VL13_Fahrrad();

        VL13_Helm helmRot = new VL13_Helm(new Color(255, 0, 0));
        VL13_Helm helmGruen = new VL13_Helm(new Color(0, 255, 0));

        VL13_Produkt[] produkte = {rad, helmGruen, helmRot};
        VL13_Warenkorb warenkorb = new VL13_Warenkorb(produkte);
        System.out.println(warenkorb.getSumme());

        System.out.println(((VL13_Helm)produkte[1]).getFarbe());
    }
}
