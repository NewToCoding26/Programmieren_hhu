public class VL25_HashSet {
    private final static int SIZE = 10;
    private VL25_Person[] persons = new VL25_Person[SIZE];

    public void insert(VL25_Person p) {
        int insertionIndex = p.hashCode() % SIZE;
        while (persons[insertionIndex] != null) {
            insertionIndex++;
            insertionIndex %= SIZE;
        }
        this.persons[insertionIndex] = p;
    }

    public boolean contains(VL25_Person p) {
        int index = p.hashCode() % SIZE;
        while (persons[index] != null && !persons[index].equals(p)) {
            index++;
            index %= SIZE;
        }
        return persons[index] != null;
    }

    @Override
    public String toString() {
        String elements = "{ ";
        for(VL25_Person person: persons) {
            if (person != null) {
                elements += person + ", ";
            }
        }
        return elements + "}";
    }




}
