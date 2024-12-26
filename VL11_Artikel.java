//   Artikel:
// * Namen
// * Netto-Preis
// * MwSt von 19% für jedes Produkt

// * Netto-Preis zurückgeben
// * Brutto-Preis zurückgeben
// * Beschreibung mit Name + Brutto-Preis zurückgeben

public class VL11_Artikel {
    private final String name;
    private final int netto;
    private static final double mehrwertsteuersatz = 1.19;

    private static int zaehler = 0;

    public VL11_Artikel(String name, int nettoPreis) {
        this.name = name;
        this.netto = nettoPreis;
        zaehler++;
    }

    public static int getZaehler() {
        return zaehler;
    }

    public int getNettoPreis() {
        return netto;
    }

    public int getBruttoPreis() {
        return (int) (netto * mehrwertsteuersatz);
    }

    public String toString() {
        return this.name + " " + this.getBruttoPreis();
    }
}

