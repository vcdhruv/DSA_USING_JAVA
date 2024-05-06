package Arrays;

public class PassByReference {

    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void change_array(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        printArray(arr);
        change_array(arr); // pass by reference
        printArray(arr);
    }
}
