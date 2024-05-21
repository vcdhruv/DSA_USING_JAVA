public class ArrayTraversal {
    public static void traverseArray(int[] arr , int currentIdx){
        if(currentIdx == arr.length) return;
        System.out.print(arr[currentIdx] + " ");
        traverseArray(arr, currentIdx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        traverseArray(arr,0);
    }
}
