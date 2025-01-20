public class VL26_GenericHashSet<T> {
    private final static int SIZE = 10;
    private Object[] objects = new Object[SIZE];

    public void insert(T object) {
        int insertionIndex = Math.abs(object.hashCode() % SIZE);
        while (objects[insertionIndex] != null) {
            insertionIndex++;
            insertionIndex %= SIZE;
        }
        this.objects[insertionIndex] = object;
    }

    public boolean contains(T object) {
        int index = Math.abs(object.hashCode() % SIZE);
        while (objects[index] != null && !objects[index].equals(object)) {
            index++;
            index %= SIZE;
        }
        return objects[index] != null;
    }

    @Override
    public String toString() {
        String elements = "{ ";
        for(Object object: objects) {
            if (object != null) {
                elements += object + ", ";
            }
        }
        return elements + "}";
    }

    public int size() {
        int usedPlaces = 0;
        for(Object object: objects) {
            if (object != null) {
                usedPlaces++;
            }
        }
        return usedPlaces;
    }
}
