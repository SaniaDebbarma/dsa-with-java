import java.util.ArrayDeque;
import java.util.Deque;
public class PalindromeBatchCheck {
    public static void main(String[] args) {
        String[] words = {"deed", "level", "hello"};
        for (String word : words){
            Deque<Character> dq = new ArrayDeque<>();
            for ( char c : word.toCharArray()){
                dq.addLast(c);

            }
            boolean isPalindrome = true;
            while (dq.size()> 1){
                if(dq.removeFirst() != dq.removeLast()) {
                    isPalindrome = false;
                    break;
                }
            }
            System.out.println(isPalindrome);
        }

    }

}
