package Linked_List;


public class KthElementFromEnd {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val; 
        }
    }
    public static void main(String[] args) {
        int k = 4;
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        Node head = a;
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(k+" Element from end is : "+slow.val);
    }
}
