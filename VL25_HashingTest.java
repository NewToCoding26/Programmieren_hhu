public class VL25_HashingTest {
    public static void main(String[] args) {
        VL25_HashSet set = new VL25_HashSet();
        set.insert(new VL25_Person("Meyer"));
        set.insert(new VL25_Person("Mecker"));
        set.insert(new VL25_Person("Brenneis"));
        set.insert(new VL25_Person("Schoettner"));
        set.insert(new VL25_Person("Mauve"));

        System.out.println(set);
        System.out.println(set.contains(new VL25_Person("Brenneis")));
    }
}
