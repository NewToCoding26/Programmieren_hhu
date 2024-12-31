public class VL17_Listst {

    public static void main(String[] args) {

        VL17_List fancyList = new VL17_List();

        fancyList.insert(3);
        fancyList.insert(2);
        fancyList.insert(1);
        fancyList.insert(0);

        System.out.println(fancyList.toString());

        fancyList.delete(3);
        System.out.println(fancyList.toString());
    }
}