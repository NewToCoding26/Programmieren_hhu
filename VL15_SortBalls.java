public class VL15_SortBalls {
    private static void sort (VL15_Sortable[] objects) {
        for (int currentIndex = 0; currentIndex < objects.length; currentIndex++) {
            VL15_Sortable currentObject = objects[currentIndex];
            int insertionPosition = currentIndex;
            while (insertionPosition > 0 && objects[insertionPosition - 1].getSortKey() > currentObject.getSortKey()) {
                objects[insertionPosition] = objects [insertionPosition - 1];
                insertionPosition--;
            }
            objects[insertionPosition] = currentObject;
        }
    }

    private static void print(VL15_Sortable[] objects) {
        for(VL15_Sortable object: objects) {
            System.out.print(object);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        VL15_Sortable[] balls = {
            new VL13_Ball(), new VL13_Ball(), new VL13_Ball(), new VL13_Ball() 
        };

        System.out.println("Unsortiert");
        print(balls);

        sort(balls);

        System.out.println("Sortiert");
        print(balls);
    }
}
