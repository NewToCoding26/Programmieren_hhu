public class VL22_Quadrat {
    public static void main(String[] args) {
        try  {
            int zahl = Integer.parseInt(args[0]);
            System.out.println(zahl*zahl);
        }
        catch (NumberFormatException exception) {
            System.out.println("Feher: es wurde keine Zahl uebergeben");
        }
        System.out.println("Hier geht es weiter");
    }
}
