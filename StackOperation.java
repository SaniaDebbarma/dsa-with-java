import java.util.Stack;

public class StackOperation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack <> ();

        stack.push(5);
        stack.push(3);
        stack.pop();
        stack.push(2);
        stack.push(8);
        stack.pop();

        int top = stack.pop();
        stack.push(top * 4);

        System.out.println(stack);
    }
    
}
