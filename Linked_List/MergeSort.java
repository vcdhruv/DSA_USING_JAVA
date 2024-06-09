package Linked_List;

import java.util.LinkedList;

public class MergeSort {
    
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val; 
        }
    }

    public static Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static LinkedList<Integer> mergeTwoSortedList(LinkedList<Integer> head1 , LinkedList<Integer> head2){
        LinkedList<Integer> mergedList = new LinkedList<>();
        int one = head1.size();
        int two = head2.size();
        int countOne = 0;
        int countTwo = 0;
        while (countOne < one && countTwo < two) {
            if(head1.get(countOne) < head2.get(countTwo)){
                // System.out.println("selected Element : "+head1.get(countOne));
                mergedList.addLast(head1.get(countOne));
                countOne++;
            }else{
                mergedList.addLast(head2.get(countTwo));
                countTwo++;
            }
        }
        while (countOne < one) {
            mergedList.addLast(head1.get(countOne));
            countOne++;
        }
        while (countTwo < two) {
            mergedList.addLast(head2.get(countTwo));
            countTwo++;
        }
        return mergedList;
    }

    public static LinkedList<Integer> mergeSort(Node head,Node tail){
        if(head == tail){
            LinkedList<Integer> ll = new LinkedList<>();
            ll.addLast(head.val);
            return ll;
        }
        Node mid = middleNode(head);
        LinkedList<Integer> firstHalf = mergeSort(head,mid);
        LinkedList<Integer> secondHalf = mergeSort(mid.next, tail);
        LinkedList<Integer> finalResult = mergeTwoSortedList(firstHalf, secondHalf);
        return finalResult;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.addLast(-1);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(6);
        Node head = (Node) ll.element();
        Node tail = (Node) ll.getLast();
        System.out.println(mergeSort(head,tail));
    }
}
