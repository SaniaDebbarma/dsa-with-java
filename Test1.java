import java.util.*;

class A{
    int val;
    A (int val){this.val = val; }

    public int hashCode() {return val % 5; }

    public boolean equals(Object o){
        return o instanceof A && ((A) o ).val== this.val;
    }
}
public class Test1 {
    public static void main (String[]args){
        Set<A> set = new HashSet<>();
        set.add(new A(10));
        set.add(new A(15));
        set.add(new A(10));
        System.out.println(set.size());
    }
}