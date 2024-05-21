import java.util.Scanner;

public class practice {
    
    public static void main(String[] args){
        int row = 5;
        int spaces = 2*row - 1;
        for (int i = 1; i <= row; i++) {
            stars:for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            spaces:for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            stars:for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            spaces-=2;

        }
    }
}
