import java.util.Scanner;

public class KerninghanAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        while (n != 0) {
            int rsbm = n & -n;
            n-=rsbm;
            counter++;
        }
        System.out.println("Number Of Set Bits : "+counter);
    }
}
