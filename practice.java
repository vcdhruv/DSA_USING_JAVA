
public class practice {
    lass Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    class Stack{
        Node head = null;
        int size = 0;
        public void push(int val){
            Node x = new Node(val);
            x.next = head;
            head = x;
            System.out.println("head : "+head.val);
            size++;
        }
        
        public void display(){
            Node temp = head;
            for (int i = 0; i < size; i++) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args){
        
    }
}
