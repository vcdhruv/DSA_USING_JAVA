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

        void insert(int val , int idx){
            Node temp = new Node(val);
            Node x = head;
            if (idx == LengthLL()) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtBeginning(val);
                return;
            } else if (idx < 0 || idx > LengthLL()) {
                System.out.println("Wrong Input!!");
                return;
            }
            int currIdx = 0;
            while (currIdx < idx) {
                currIdx++;
                x = x.next;
            }
            temp.next = x.next;
            x.next = temp;
        }

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtBeginning(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
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
        ll.insertAtBeginning(0);
        ll.displayLL();
        ll.insert(4, 3);
        ll.displayLL();
        System.out.println("head node : "+ll.head.data);
        System.out.println("tail node : "+ll.tail.data);

    }
}
