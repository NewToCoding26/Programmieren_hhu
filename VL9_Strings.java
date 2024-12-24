public class VL9_Strings {
    public static void main(String[] args) {
        String a = "hello";
        System.out.println(a.charAt(0));


        String b = new String("hello");
        System.out.println(b.charAt(2));


        char[] chars = { 'h', 'e', 'l', 'l', 'o'};
        String c = new String(chars);

        System.out.println(c.length());

        System.out.println(a == b);
        System.out.println(a.equals(b));

        String d = "hello";
        String e = d;

        System.out.println(d == e);

    }
}
