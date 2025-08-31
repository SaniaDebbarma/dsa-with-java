import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<> ();
        list.add ("A");
        list. add("B");
        list.add("C");
        list.poll ();
        list.peek();
        list.remove("C");
        System.out.println(list.contains("A"));
    }
    
}
