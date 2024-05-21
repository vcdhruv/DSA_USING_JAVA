package Sorting;

public class LinearSearch {
    public static boolean linearSearch(int[] arr , int target , int idx){
        if(idx == arr.length-1){
            return arr[idx] == target ? true : false;
        }
        linearSearch(arr, target, idx+1);
        return arr[idx] == target ? true : false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 3;
        // linearSearch(arr, target, 0);
        System.out.println(linearSearch(arr, target, 0));
    }
}
