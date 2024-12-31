public class VL17_Listst {

    public static void main(String[] args) {

  /*      VL17_List fancyList = new VL17_List();
        fancyList.insert(3);
        fancyList.insert(2);
        fancyList.insert(1);
        fancyList.insert(0);
        System.out.println(fancyList.toString());
*/

        VL17_GenericList studiList = new VL17_GenericList();
        studiList.insert(new VL15_Studi("Alice", 123));
        studiList.insert(new VL15_Studi("Bob", 234));
        studiList.insert(new VL15_Studi("Lea", 555));
        studiList.insert(new VL13_Ball());
        System.out.println(studiList.toString());


        VL17_GenericList ballList = new VL17_GenericList();
        ballList.insert(new VL13_Ball());
        ballList.insert(new VL13_Ball());
        ballList.insert(new VL13_Ball());
        System.out.println(ballList.toString());

        VL17_ListData ldata = ballList.at[0];



    }
}