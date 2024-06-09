package Stacks;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int[] arr = {2,4,8,12,3,7,9,6};
        st.push(0);
        int[] result = new int[arr.length];
        result[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int number = arr[i];
            while (st.size() > 0 && number > arr[st.peek()]) {
                st.pop();
            }
            int span = st.size() == 0 ? i+1 : i-st.peek();
            result[i] = span;
            st.push(i);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
