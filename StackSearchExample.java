import java.util.Stack;
public class StackSearchExample {
    public static void main(String[] args) {
        Stack<Integer> s  = new Stack<> ();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        int [] searchFor = {30, 10, 50};
        for (int val : searchFor){
            System.out.println("search(" + val + " )="+ s.search(val));
        }
    }
    
}
