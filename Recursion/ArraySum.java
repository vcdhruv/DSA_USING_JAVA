public class ArraySum {
    public static int sum(int[] arr , int currIdx){
        if(currIdx == arr.length) return 0;
        return arr[currIdx] + sum(arr, currIdx+1);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,20,1};
        System.out.println(sum(arr,0));
    }
}
