package Stacks;
import java.util.Stack;
public class NextGreaterElement {

    public static int[] nGEFromRightToLeft(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];
        st.push(arr[arr.length-1]);
        result[arr.length-1] = -1;
        for (int i = arr.length-2; i >= 0; i--) {
            int number = arr[i];

            //first pop
            while (st.size() > 0 && number >= st.peek()) {
                st.pop();
            }

            //then answer
            int number_to_be_added_to_result_array = st.size() == 0 ? -1 : st.peek();
            result[i] = number_to_be_added_to_result_array;

            //then push
            st.push(number); 
        }
        return result;
    }

    public static int[] nGEFromLeftToRight(int[] arr){
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int[] result = new int[arr.length];
        result[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int number = arr[i];
            // pop and answer
            while (st.size() > 0 && number > arr[st.peek()]) {
                result[st.pop()] = number;
            }

            //then push
            st.push(i);
            // System.out.println(st);
        }
        while (st.size() != 0) {
            result[st.pop()] = -1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,8,12,3,7,9,6};
        int[] result1 = nGEFromRightToLeft(arr);
        int[] result2 = nGEFromLeftToRight(arr);
        System.out.print("Result1 : ");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        System.out.print("Result2 : ");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
    }
}
