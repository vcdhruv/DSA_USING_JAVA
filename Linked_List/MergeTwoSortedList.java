package Linked_List;

public class MergeTwoSortedList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node a1 = new Node(6);
        Node a2 = new Node(20);
        Node a3 = new Node(30);
        Node a4 = new Node(40);
        Node a5 = new Node(50);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = null;
        Node head1 = a1;
        Node b1 = new Node(7);
        Node b2 = new Node(9);
        Node b3 = new Node(12);
        Node b4 = new Node(15);
        Node b5 = new Node(37);
        Node b6 = new Node(43);
        Node b7 = new Node(44);
        Node b8 = new Node(45);
        Node b9 = new Node(52);
        Node b10 = new Node(56);
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = b5;
        b5.next = b6;
        b6.next = b7;
        b7.next = b8;
        b8.next = b9;
        b9.next = b10;
        b10.next = null;
        Node head2 = b1;
        Node temp1 = head1;
        Node temp2 = head2;
        Node newList = new Node(0);
        Node newTemp = newList;
        while (temp1 != null && temp2 != null) {
            boolean condition = temp1.val < temp2.val;
            // System.out.println("condition : "+condition);
            Node selectedNode = condition ? temp1 : temp2;
            // System.out.println("selected node : "+selectedNode.val);
            newTemp.next = selectedNode;
            newTemp = newTemp.next;
            if(condition) temp1 = temp1.next;
            else temp2 = temp2.next;
        }
        while (temp1 != null) {
            newTemp.next = temp1;
            newTemp = newTemp.next;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            newTemp.next = temp2;
            newTemp = newTemp.next;
            temp2 = temp2.next;
        }
        newList = newList.next;
        while (newList != null) {
            System.out.print(newList.val + " ");
            newList = newList.next;
        }
    }
}
