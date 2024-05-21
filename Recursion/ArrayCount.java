public class ArrayCount {
    public static void countOccurrence(int[] arr , int x , int idx){
        if(idx == arr.length) return;
        if (arr[idx] == x) {
            System.out.println(idx);
        }
        countOccurrence(arr, x, idx+1);
    }
    public static void main(String[] args) {
        int[] n = {1,2,3,2,2,5};
        countOccurrence(n, 2, 0);
    }
}
