public class References {

    private static void swap1(int number1, int number2) {
        int oldNumber1 = number1;
        number1 = number2;
        number2 = oldNumber1;
    }

    private static void swap2(int[] array) {
        int oldFirstElement = array[0];
        array[0] = array[1];
        array[1] = oldFirstElement;
    }

    private static void swap3(int[] array1, int[] array2) {
        int[] oldArray1 = array1;
        array1 = array2;
        array2 = oldArray1;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        swap1(n1, n2);

        System.out.println(n1); // Ausgabe: 10
        System.out.println(n2); // Ausgabe: 20
        /*
        Begründung:
        Die Werte n1 und n2 werden beim Aufruf der Methode swap1 kopiert.
        Die veränderungen betreffen nur die kopien number1 und number2, aber weil n1 und n2 im main Stack sind bleiben die unverändert.
         */

        int[] v1 = {1, 2};

        swap2(v1);

        System.out.println(v1[0]); // Ausgabe: 2
        /*
        Begründung:
        Arrays sind in Java Referenztypen. Das bedeutet, wenn das Array v1 an die Methode swap2 übergeben wird, zeigt die Methode auf das-
        selbe Array im Heap, das auch in main liegt. Wenn in swap2 die Werte getauscht werden, ändert sich das Array im Heap direkt.
        Deshalb hat v1[0] nach dem Tausch den Wert 2.
         */

        int[] v2 = {1, 2};
        int[] v3 = {3, 4};

        swap3(v2, v3);

        System.out.println(v2[0]); // Ausgabe: 1
        System.out.println(v3[0]); // Ausgabe: 3
        /*
        Begründung:
        In Java werden Referenzen immer per Call-by-Value übergeben. Das heißt, die Methode swap3 arbeitet nur mit Kopien der Referenzen,
        die im Stack liegen. Die Arrays selbst, auf die v2 und v3 zeigen, bleiben unverändert. Deshalb bleibt v2[0] gleich 1 und v3[0]
        gleich 3.
         */
    }
}
