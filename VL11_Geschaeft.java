public class VL11_Geschaeft {
    public static void main (String[] args) {
        System.out.println(VL11_Artikel.getZaehler());

        VL11_Artikel tv = new VL11_Artikel("TV", 79900);
        System.out.println(VL11_Artikel.getZaehler());

        System.out.println(tv);
        System.out.println(tv.getBruttoPreis());
        System.out.println(tv.getNettoPreis());

        VL11_Artikel kabel = new VL11_Artikel("kabel", 1599);
        System.out.println(VL11_Artikel.getZaehler());

        System.out.println(kabel);
        System.out.println(kabel.getBruttoPreis());
        System.out.println(kabel.getNettoPreis());
    }

}
