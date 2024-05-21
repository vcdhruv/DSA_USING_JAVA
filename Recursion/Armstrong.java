public class Armstrong {
    static int count;
    public static int countDigits(int n){
        if(n == 0) return 0;
        countDigits(n/10);
        return count+=1;
    }
    
    public static int createArmstrong(int n){
        if(n == 0) return 0;
        return (int)Math.pow(n%10, count) + createArmstrong(n/10);
    }
    public static boolean isArmstrong(int n){
        if(n == createArmstrong(n)) return true;
        return false;
    }
    public static void main(String[] args) {
        countDigits(153); // this line is important
        System.out.println("Armstrong number : "+isArmstrong(153));
    }
}
