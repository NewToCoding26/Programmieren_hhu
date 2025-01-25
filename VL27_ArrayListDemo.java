import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VL27_ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);


        List<Integer> list = numbers;
        list.add(42);
        System.out.println(list);
    }
}
