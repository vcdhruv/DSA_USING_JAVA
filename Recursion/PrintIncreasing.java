public class PrintIncreasing {
    public static void printIncreasing(int n){
        if(n == 1) {
            System.out.println(1);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printIncreasing(5);
    }
}
