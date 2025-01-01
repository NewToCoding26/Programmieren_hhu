import java.util.Scanner;

public class VL18_Calculator {
    
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        VL18_Stack<String> operators = new VL18_Stack<String>(); // Stack fuer die operatoren
        VL18_Stack<Integer> operands = new VL18_Stack<Integer>(); // Stack fuer die operanden

        while (stdin.hasNext()) {
            String value = stdin.next(); // naechste Zeichenkette

            if (value.equals("+") || value.equals("*")) {
                operators.push(value);
            }
            else if (value.equals("(")) {
            }
            else if (value.equals(")")) {
                int a = operands.pop();
                int b = operands.pop();
                String op = operators.pop();

                if (op.equals("+")) {
                    operands.push(a+b);
                } else {
                    operands.push(a*b);
                }
            }
            else {
                operands.push(Integer.parseInt(value));
            }
        }

        System.out.println(operands.pop());

    }
}
