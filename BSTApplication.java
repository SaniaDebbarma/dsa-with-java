import java.util. *;

class Node{
    int val;
    Node left, right;
    Node(int x) {  val =x; }
}
public class BSTApplication {
    public static void insert(Node root, int val){
        if (val < root.val){
            if (root.left == null) root.left = new Node(val);
            else insert(root.left,val);
        }else{
            if (root.right = = null) root.right = new Node(val);
            else insert(root.right, val);
        }
    }
    public static void inOrder (Node root){
        if(root ! = null){
            inOrder(root.left);
            System.out.println(root.val + " ");
            inOrder(root.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(30);
        int[] vals = {20,10, 40, 35};
        for(int v : vals) insert(root, v);
        inOrder(root);
    }
    
}
