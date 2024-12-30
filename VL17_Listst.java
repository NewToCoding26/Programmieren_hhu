public class VL17_Listst {

    public static void main(String[] args) {
        VL17_Node element1 = new VL17_Node(1, null);
        VL17_Node element2 = new VL17_Node(2, element1);
        VL17_Node element3 = new VL17_Node(3, element2);

        System.out.println(element3.data);
    }
}