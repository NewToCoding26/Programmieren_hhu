public class VL18_StackTest {
    
    public static void main(String[] args) {
        VL18_Stack <Integer> stack = new VL18_Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
