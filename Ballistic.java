public class Ballistic {
    public static void main(String[] args) {
        double position = Double.parseDouble(args[0]);
        double speed = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);
        double earthSpeed = 9.81;
        double ballistischeKurvenFormel =position + speed * time - (earthSpeed * Math.pow(time, 2)) / 2;
        System.out.println(ballistischeKurvenFormel);
    }
}
