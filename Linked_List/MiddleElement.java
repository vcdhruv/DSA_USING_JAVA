package Linked_List;

public class MiddleElement {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
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
        e.next = null;
        int size = 0;
        Node head = a;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        System.out.println("Size : "+size);
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element : "+slow.val);
    }
}
