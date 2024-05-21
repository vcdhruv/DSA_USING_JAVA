public class Power {
    public static int power(int p , int q){
        if(q==0) return 1;
        return power(p, q-1) * p;
    }
    public static int power1(int p , int q){
        if(q == 0) return 1;
        int smallAns = power1(p, q/2);
        if (q % 2 == 0) {
            return smallAns * smallAns;
        }else{
            return smallAns * smallAns * p;
        }
    }
    public static void main(String[] args) {
        System.out.println("O(q) : "+power(2,3));
        System.out.println("O(logq) : "+power1(2,3));

    }
}
