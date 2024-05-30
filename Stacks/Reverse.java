package Stacks;

import java.util.Stack;

public class Reverse {
    public static void iterativeReverse(Stack st1){
        Stack<Integer> st2 = new Stack<>();
        while (st1.size() > 0) {
            st2.push((Integer) st1.pop());
        }
        Stack<Integer> st3 = new Stack<>();
        while (st2.size() > 0) {
            st3.push(st2.pop());
        }
        while (st3.size() > 0) {
            st1.push(st3.pop());
        }
    }
    public static void pushAtBottom(Stack s , int val){
        if(s.size() == 0){
            s.push(val);
            return;
        }
        int top = (int) s.pop();
        pushAtBottom(s, val);
        s.push(top);
    }

    public static void recursiveReverse(Stack st1){
        if(st1.size() == 1) return;
        int top = (int)st1.pop();
        recursiveReverse(st1);
        pushAtBottom(st1, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        System.out.println("Array : "+st1);
        iterativeReverse(st1);
        System.out.println("Reversed Array : "+st1);
        Stack<Integer> st2 = new Stack<>();
        st2.push(1);
        st2.push(2);
        st2.push(3);
        st2.push(4);
        System.out.println("Array : "+st2);
        recursiveReverse(st2);
        System.out.println("Reversed Array : "+st2);


    }
}
