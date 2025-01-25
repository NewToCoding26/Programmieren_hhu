import java.util.HashMap;

public class VL27_HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> lectureHalls = new HashMap<>();
        lectureHalls.put("5A", 299);
        lectureHalls.put("5B", 140);
        lectureHalls.put("5C", 150);
        lectureHalls.put("6J", 300);

        System.out.println(lectureHalls);

        System.out.println(lectureHalls.get("5A"));
    }
}
