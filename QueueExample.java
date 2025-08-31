import java.util.ArrayDeque;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<> ();
        q.add(1);
        q.add(2);
        q.remove();
        q.add(3);
        System.out.println(q);
        
    }

    
}
