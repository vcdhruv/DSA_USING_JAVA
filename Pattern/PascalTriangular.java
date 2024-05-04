package Pattern;

import java.util.Scanner;

public class PascalTriangular {
    //at starting it will be 1 only;
    //to get newvalue use icjp1 = icj * (i - j) / j+1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of pascal's triangle : ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int iCj = 1; // on every row start nC0 is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(iCj+"\t");
                int iCjp1 = (iCj * (i-j))/(j+1); // to get new value from old value
                iCj = iCjp1;
            }
            System.out.println();
        }
    }
}
