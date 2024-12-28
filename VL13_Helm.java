import java.awt.Color;

public class VL13_Helm implements VL13_Produkt{
    private double preis;
    private Color farbe;

    public VL13_Helm(Color farbe) {
        preis = 29.99;
        this.farbe = farbe;
    }

    public double getPreis() {
        return preis;
    }

    public Color getFarbe() {
        return farbe;
    }
}
