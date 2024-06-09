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
public class Queue {
    public static class LLToQueueAdapter{
        LL ll = new LL();

        void push(int val){
            ll.addLast(val);
        }

        void pop(){
            if (ll.size == 0) {
                System.out.println("Queue underflow!");
            }else{
                ll.removeFirst();
            }
        }

        int top(){
            if(ll.size == 0){
                System.out.println("Queue underflow!");
                return -1;
            }else{
                return ll.tail.val;
            }
        }

        int peek(){
            if(ll.size == 0){
                System.out.println("Queue underflow!");
                return -1;
            }else{
                return ll.tail.val;
            }
        }

        void queueDisplay(){
            ll.display();
        }
    }
    public static void main(String[] args) {
        LLToQueueAdapter llqa = new LLToQueueAdapter();
        llqa.push(0);
        llqa.push(1);
        llqa.push(2);
        llqa.queueDisplay();
        llqa.pop();
        System.out.println("----------------------");
        llqa.queueDisplay();
        llqa.pop();
        System.out.println("----------------------");
        llqa.queueDisplay();
        llqa.pop();
        System.out.println("----------------------");
        llqa.queueDisplay();
        System.out.println("Peek element is : "+llqa.peek());
    }
}
