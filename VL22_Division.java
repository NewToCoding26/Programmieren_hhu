public class VL22_Division {
    
    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        try {
            int dividend = parse(args[0]);
            int divisor  = parse(args[1]);
            int result   = dividend / divisor;
            System.out.println(result);
        } 
        catch(NumberFormatException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            System.out.println("Fehler: es wurde keine zahl uebergeben");
        }
        catch(ArithmeticException exception) {
            System.out.println("Fehler: es wurde versucht durch 0 zu dividieren");
        }

        System.out.println("Bye!");
    }
}
