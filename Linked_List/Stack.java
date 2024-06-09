package Linked_List;
class LL{
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val; 
        }
    }

    Node head = null;
    Node tail = null;
    int size;

    public void addFirst(int val){
        Node y = new Node(val);
        if(size == 0){
            head = tail = y;
            size = 1;
        }else{
            y.next = head;
            head = y;
            size++;
        }
    }

    public Node getFirst(){
        return head;
    }

    public void removeFirst(){
        if(size == 0){
            head = tail = null;
            size = 0;
        }else{
            head = head.next;
            size--;
        }
    }

    public void addLast(int val){
        Node x = new Node(val);
        if (size == 0) {
            head = tail = x;
            size = 1;
        }else{
            Node temp = head;
            for (int i = 0; i < size - 1; i++) {
                temp = temp.next;
            }
            temp.next = x;
            tail = x;
            size++;
        }
    }

    public Node getLast(){
        return tail;
    }

    public void removeLast(){
        if (size == 0) {
            System.out.println("Linked List is empty!");
        }else if(size == 1){
            head = tail = null;
            size = 0;
        }else{
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            size--;
        }
    }

    public int size(){
        return size;
    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class Stack {
    public static class LLToStackAdapter{
        LL ll = new LL();
        
        void push(int val){
            ll.addFirst(val);
        }

        void pop(){
            if(ll.size() == 0){
                System.out.println("stack underflow!");
            }else{
                ll.removeFirst();
            }
        }

        int top(){
            if (ll.size() == 0) {
                System.out.println("stack underflow!");
                return -1;
            }
            return ll.head.val;
        }

        int peek(){
            if (ll.size() == 0) {
                System.out.println("stack underflow!");
                return -1;
            }
            return ll.head.val;
        }
    }
    public static void main(String[] args) {
        LLToStackAdapter llsa = new LLToStackAdapter();
        llsa.push(0);
        llsa.push(1);
        llsa.push(2);
        llsa.pop();
        llsa.pop();
        llsa.pop();
        System.out.println("Peek element : "+llsa.peek());
    }
}
