public class VL17_Benchmark {
    public static void main(String[] args) {
        for(int groesse = 1000; groesse < 4_100_000; groesse *= 2) {
            int[] array = groesseArray(groesse);
            VL17_List liste = groesseListe(groesse);
            System.out.print(groesse + ",");

            long start = System.currentTimeMillis();
            for(int wiederholung = 0; wiederholung < 10_000_000; wiederholung++) {
                int zufaelligerIndex = (int) (Math.random() * groesse);
                int x = array[zufaelligerIndex];
            }
            long end = System.currentTimeMillis();
            System.out.print((end - start) / 10_000_000. + ",");

            start = System.currentTimeMillis();
            for(int wiederholung = 0; wiederholung < 1_000; wiederholung++) {
                int zufaelligerIndex = (int) (Math.random() * groesse);
                int x = liste.at(zufaelligerIndex);
            }
            end = System.currentTimeMillis();
            System.out.println((end - start) / 1_000.);

        }
    }

    private static int[] groesseArray(int groesse) {
        int[] array = new int[groesse];
        for(int i = 0; i < groesse; i++) {
            array[i] = 1;
        }
        return array;
    }

    private static VL17_List groesseListe(int groesse) {
        VL17_List liste = new VL17_List();
        for(int i = groesse - 1; i >= 0; i--) {
            liste.insert(i);
        }
        return liste;
    }
}
