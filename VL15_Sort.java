public class VL15_Sort {    

    private static void sort(VL15_Studi[] studi) {
        for(int currentIndex = 0; currentIndex <studi.length; currentIndex++) {
            //naechste karte
            VL15_Studi currentStudi = studi[currentIndex];

            //vorlaeufige einfüger Position
            int insertionPosition = currentIndex;

            //solange die Zahl links von der akt. Zahl groesser ist und wir nicht am Anfang sind
            while (insertionPosition > 0 && studi[insertionPosition - 1].getMatrikelNummer() > currentStudi.getMatrikelNummer()) {
                //kopiere die zahl eine position nach rechts
                studi[insertionPosition] = studi[insertionPosition - 1];

                //gehe weiter nach links
                insertionPosition--;

            }

            //aktuelle Zahl an der Richtigen Position einfueegen
            studi[insertionPosition] = currentStudi;
        }
    }

    private static void print(int[] numbers) {
        for(int number: numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }

    private static void print(VL15_Studi[] studis) {
        for(VL15_Studi studi: studis) {
            System.out.print(studi + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VL15_Studi[] studis = {
            new VL15_Studi("Sasha", 3333),
            new VL15_Studi("Maria", 1111),
            new VL15_Studi("Liam", 2222)
        };
        

        print(studis);
        sort(studis);
        print(studis);
    }
}
