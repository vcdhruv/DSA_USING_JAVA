package Linked_List;

public class LengthLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        int length = 0;
        Node head = a;
        while (head != null) {
            length++;
            head = head.next;
        }
        System.out.println("Length of Linked List : "+length);
    }
}
