public class VL17_Listst {

    public static void main(String[] args) {

        VL17_List fancyList = new VL17_List();

        fancyList.insert(3);
        fancyList.insert(2);
        fancyList.insert(1);
        fancyList.insert(0);
        System.out.println(fancyList.toString());


        VL17_StudiList studiList = new VL17_StudiList();
        studiList.insert(new VL15_Studi("Alice", 123));
        studiList.insert(new VL15_Studi("Bob", 234));
        studiList.insert(new VL15_Studi("Lea", 555));
        System.out.println(studiList.toString());

    }
}