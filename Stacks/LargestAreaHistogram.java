package Stacks;

import java.util.Stack;

public class LargestAreaHistogram {

    public static int[] generateNextSmallerElementOnRight(int[] arr){
        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);
        int[] result = new int[arr.length];
        result[arr.length - 1] = arr.length;
        for (int i = arr.length-2; i >= 0; i--) {
            int number = arr[i];
            while (st.size() > 0 && number <= arr[st.peek()]) {
                st.pop();
            }

            int number_to_be_added_to_result = st.size() == 0 ? arr.length : st.peek();
            result[i] = number_to_be_added_to_result;

            st.push(i);
        }
        return result;
    }

    public static int[] generateNextSmallerElementOnLeft(int[] arr){
        Stack<Integer> st= new Stack<>();
        int[] result = new int[arr.length];
        st.push(0);
        result[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            int number = arr[i];
            //first pop
            while (st.size() > 0 && number <= arr[st.peek()]) {
                st.pop();
            }
            //then answer
            int number_to_be_added_to_result = st.size() == 0 ? -1 : st.peek();
            result[i] = number_to_be_added_to_result;

            //then push
            st.push(i);
            // System.out.println("stack for iteration "+i+" is : "+st);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {6,2,5,4,5,1,6};
        int[] rb = generateNextSmallerElementOnRight(arr);
        int[] lb = generateNextSmallerElementOnLeft(arr);
        System.out.print("Next smaller element on the left :  ");
        for (int i = 0; i < lb.length; i++) {
            System.out.print(lb[i] + " ");
        }
        System.out.println();
        System.out.print("Next smaller element on the right : ");
        for (int i = 0; i < rb.length; i++) {
            System.out.print(rb[i] + " ");
        }
        System.out.println();
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = rb[i] - lb[i] - 1;
            int area = arr[i] * width;
            if (area > maxArea) {
                maxArea = area;
            }
        }
        System.out.println("MaxArea is : "+maxArea);
    }
}
