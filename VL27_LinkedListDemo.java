import java.util.Collections;
import java.util.LinkedList;

public class VL27_LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Aley");
        names.add("Eva");
        names.add("Sache");
        System.out.println(names);
        Collections.shuffle(names);
        System.out.println(names);

    }
}
