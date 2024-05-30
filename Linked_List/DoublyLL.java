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
    
    public static Node insertAtEnd(Node head, int val){
        Node x = new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;   
        }
        temp.next = x;
        x.prev = temp;
        return head;
    }
    
    public static void insert(Node head , int val , int idx){
        Node x = new Node(val);
        Node s = head;
        for (int i = 1; i <= idx-1; i++) {
            s = s.next;
        }
        Node r = s.next;
        s.next = x;
        x.prev = s;
        x.next = r;
        r.prev = x;
    }
    
    public static void displayRecursive(Node head){
        if(head == null) return;
        System.out.print(head.val+" ");
        displayRecursive(head.next);
    }

    public static void displayReverseRecursive(Node head){
        if(head == null) return;
        displayReverseRecursive(head.next);
        System.out.print(head.val+" ");
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
        insertAtEnd(head, 5);
        insert(a, 2, 0);
        insert(a, 7, 7);
        display(a);
        System.out.println();
        System.out.println("head : "+head.val);
        displayRecursive(a);
        System.out.println();
        displayReverseRecursive(a);
    }
}
