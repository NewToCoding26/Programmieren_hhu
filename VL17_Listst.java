public class VL17_Listst {

    public static void main(String[] args) {

        VL18_GenericList <Integer> fancyList = new VL18_GenericList<Integer>();
        fancyList.insert(Integer.valueOf(3));
        fancyList.insert(Integer.valueOf(2));
        fancyList.insert(Integer.valueOf(1));
        fancyList.insert(Integer.valueOf(0));
        System.out.println(fancyList.toString());


        VL18_GenericList <VL15_Studi> studiList = new VL18_GenericList <VL15_Studi>();
        studiList.insert(new VL15_Studi("Alice", 123));
        studiList.insert(new VL15_Studi("Bob", 234));
        studiList.insert(new VL15_Studi("Lea", 555));
        System.out.println(studiList.toString());


        VL18_GenericList <VL13_Ball> ballList = new VL18_GenericList <VL13_Ball>();
        ballList.insert(new VL13_Ball());
        ballList.insert(new VL13_Ball());
        ballList.insert(new VL13_Ball());
        System.out.println(ballList.toString());

        VL13_Ball ball = ballList.at(0);
        ball.move();


    }
}