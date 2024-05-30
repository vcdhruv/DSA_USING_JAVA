package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class InsertAtBottom {
    public static void pushAtBottom(Stack s , int val){
        if(s.size() == 0){
            s.push(val);
            return;
        }
        int top = (int) s.pop();
        pushAtBottom(s, val);
        s.push(top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value you want to enter : ");
        int val = sc.nextInt();
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        System.out.println("Your Array : "+st1);
        Stack<Integer> st2 = new Stack<>();
        int st1Size = st1.size();
        for (int i = 0; i < st1Size; i++) {
            st2.push(st1.pop());
        }
        st1.push(val);
        int st2Size = st2.size();
        for (int i = 0; i < st2Size; i++) {
            st1.push(st2.pop());
        }
        pushAtBottom(st1, 7);
        System.out.println("Array : "+st1);
    }

}
