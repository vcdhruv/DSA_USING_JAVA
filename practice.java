import java.util.Scanner;

public class practice {
    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void reverse(int[] nums,int start , int end){
        int i = start , j = end;
        while(i < j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k < 0) k = k + nums.length;
        
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = -100;
        k=k%nums.length;
        rotate(nums,k);
        printArray(nums);
    }
}
