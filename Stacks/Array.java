package Stacks;

class Stack{
    int[] arr = new int[5];
    int idx = 0;
    public void push(int val){
        arr[idx] = val;
        idx++;
    }
    public void display(){
        for (int i = 0 ; i <= idx - 1 ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int peek(){
        if(idx == 0){
            System.out.println("It is empty");
            return -1;
        }
        return arr[idx-1];
    }
    public int pop(){
        if(idx == 0){
            System.out.println("It is empty");
            return -1;
        }
        int top = arr[idx-1];
        arr[idx-1] = 0;
        idx--;
        return top; 
    }

}
public class Array {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.display();
        st.push(6);
        st.display();
        st.push(7);
        st.display();
        st.push(8);
        st.display();
        st.push(9);
        st.display();
        st.pop();
        System.out.println(st.peek());
        st.display();
    }
}
