import java.util.*;
public class HashSetDemo {
    public static void main (String[]args){
        Set<String> s = new HashSet<>();
        s.add("pen");
        s.add("pencil");
        s.add("pen");
        System.out.println(s.size());
    }
    
}
