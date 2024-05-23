package Linked_List;

public class DoublyLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    public static void displayReverse(Node tail){
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
    }
    public static Node insertAtHead(Node head,int val){
        Node x = new Node(val);
        x.next = head;
        head.prev = x;
        head = x;
        return head;
    }
    public static Node insertAtEnd(Node tail , int val){
        Node x = new Node(val);
        tail.next = x;
        x.prev = tail;
        tail = x;
        return tail;
    }
    public static void main(String[] args) {
        Node a = new Node(0);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(4);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        System.out.print("Forward : ");
        display(a);
        System.out.println();
        System.out.print("Reverse : ");
        displayReverse(e);
        System.out.println();
        Node head = insertAtHead(a,-1);
        a = head;
        Node tail = insertAtEnd(e, 5);
        a = tail;

        System.out.println("head : "+head.val);
        System.out.println("tail : "+tail.val);
        display(a);
    }
}
