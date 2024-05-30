package Stacks;

import java.util.Stack;

public class CopyStackToAnother {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        System.out.println("Original Stack : "+st1);
        Stack<Integer> st2 = new Stack<>();
        int st1Size = st1.size();
        for (int i = 0; i < st1Size; i++) {
            st2.push(st1.pop());
        }
        System.out.println(st2);
        Stack<Integer> st3 = new Stack<>();
        int st2Size = st2.size();
        for (int i = 0; i < st2Size; i++) {
            st3.push(st2.pop());
        }
        System.out.println("Copied stack : "+st3);
    }
}
