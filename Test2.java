import java.util.PriorityQueue;
public class Test2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<> ();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println(pq.poll() + " ");
        System.out.println(pq.peek());
    }
    
}
