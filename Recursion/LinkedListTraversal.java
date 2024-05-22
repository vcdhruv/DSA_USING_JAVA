public class LinkedListTraversal {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void displayReverseLL(Node head){
        if(head.next == null) return;
        displayReverseLL(head.next);
        System.out.print(head.data+" ");
    }

    public static void displayLL(Node head){
        if(head.next == null) return;
        System.out.print(head.data+" ");
        displayLL(head.next);
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
        Node head = a;
        displayLL(head);
        System.out.println();
        displayReverseLL(head);
    }
}
