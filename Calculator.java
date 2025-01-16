public class Calculator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("too few arguments, expected: operand operator operand");
            return;
        }

        if (args.length > 3) {
            System.out.println("too many arguments, expected: operand operator operand");
            return;
        }

        double operand1;
        double operand2;

        try {
            operand1 = Double.parseDouble(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("first operand is no number: " + args[0]);
            return;
        }

        String operator = args[1];

        try {
            operand2 = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("second operand is no number: " + args[2]);
            return;
        }

        switch (operator) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "x":
                System.out.println(operand1 * operand2);
                break;
            case ":":
                if (operand2 == 0) {
                    System.out.println("division by zero");
                } else {
                    System.out.println(operand1 / operand2);
                }
                break;
            default:
                System.out.println("unknown operator " + operator + ", supported operators: + - x :");
        }
    }
}

