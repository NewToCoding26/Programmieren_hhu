public class VL13_Warenkorb {
    
    private VL13_Produkt[] produkte;
    
    public VL13_Warenkorb(VL13_Produkt[] produkte) {
        this.produkte = produkte;
    }
    
    public VL13_Warenkorb(VL13_Produkt produkt) {
        this (new VL13_Produkt[] {produkt});
    }
    
    public double getSumme() {
        double summe = 0;
        for(VL13_Produkt produkt: produkte) {
            summe += produkt.getPreis();
        }
        return summe;
    }
}
