public class Multiplication {
    public static int mul(int x , int y){
        if(x < y) return mul(y, x);
        else if(y != 0) return x + mul(x, y-1);
        else return 0;
    }
    public static void main(String[] args) {
        
        System.out.println("Multiplication : "+mul(2, 4));
    }
}
