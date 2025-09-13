import java.util.*;
public class Test3 {
    public static void main(String[]args){
        Map<Integer, String> m1 = new HashMap<>();
        Map<Integer, String> m2 = new HashMap<>();
        m1.put(1,"A");
        m1.put(2,"B");
        m2.put(2, "X");
        m2.put(3, "C");
        m1.putAll(m2);
        System.out.println(m1);
    }
    
}
