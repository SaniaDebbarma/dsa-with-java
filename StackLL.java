public class StackLL {
    class Node {
        int data;
        Node next;
        Node(int data) {this.data=data; }

    }
    Node top;

    void push (int data){
        Node node = new Node (data);
        node.next = top;
        top = node;

        
    }
    int pop(){
        return top.data;
        top = top.next;

    }
    public static void main(String[] args) {
        StackLL stack = new StackLL ();
        stack.push(10);
        stack.pop();
    }
}

//unreachable code is the answer for NPTEl assignment 5 Q4