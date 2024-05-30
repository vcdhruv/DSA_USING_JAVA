package Stacks;

import java.util.Stack;

public class DisplayStack {
    public static void display(Stack st){
        if(st.size() == 0) return;
        int top = (int) st.pop();
        System.out.print(top + " ");
        display(st);
        st.push(top);
    }
    public static void displayRev(Stack st){
        if(st.size() == 0) return;
        int top = (int)st.pop();
        displayRev(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        display(st1);
        System.out.println();
        displayRev(st1);
    }
}
