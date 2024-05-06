package Arrays;
public class ReferenceCopy {
    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("Original Array : ");
        printArray(arr);

        // reference copy 
        int[] arr_2 = arr;

        System.out.println("Copied Array : ");
        printArray(arr_2);

        arr_2[0] = 0;
        arr_2[1] = 0;

        System.out.println("Original Array after changing arr_2 : ");
        printArray(arr);

        System.out.println("Copied Array after changing arr_2 : ");
        printArray(arr_2);
    }
}
