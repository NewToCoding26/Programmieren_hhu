public class ListPlayground {

    public static void main(String[] args) {
        ListFürPlayGround<String> stringliste = new ListFürPlayGround<>()<>();

        stringliste.append("Welt");
        stringliste.append("!");
        stringliste.prepend("Hallo");

        System.out.println("Die Länge der Liste ist: " + stringliste.size());
        String erstesElement = stringliste.first();
        System.out.println("Das erste Element ist: " + erstesElement);
        System.out.println("Das Element mit Index 2 ist: " + stringliste.get(2));
        System.out.println("Das letzte Element ist: " + stringliste.get(stringliste.size() - 1));
        System.out.println("Die gesamte Liste ist: " + stringliste.toString());
        System.out.println("Und nochmal die ganze Liste: " + stringliste.toString());
    }
}
