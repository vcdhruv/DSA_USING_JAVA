package Linked_List;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }

        void displayLL(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int LengthLL(){
            int length = 0;
            Node temp = head;
            while (temp != null) {
                length++;
                temp = temp.next;
            }
            System.out.println("Length : "+length);
            return length;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.displayLL();
        ll.LengthLL();
        ll.insertAtEnd(3);
        ll.displayLL();
    }
}
