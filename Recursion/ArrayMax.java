public class ArrayMax {
    public static int maxArray(int[] arr , int value , int currentIdx){
        if(currentIdx == arr.length) return value;
        // value = arr[currentIdx] > value ? arr[currentIdx] : value;
        value = maxArray(arr, arr[currentIdx] > value ? arr[currentIdx] : value, currentIdx+1);
        return value;
    }
    public static void main(String[] args) {
        int[] arr = {3,10,3,2,5};
        System.out.println(maxArray(arr,Integer.MIN_VALUE,0));
        
    }
}
