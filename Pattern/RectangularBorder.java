package Pattern;

import java.util.Scanner;

public class RectangularBorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int columns = sc.nextInt();
        outer:for (int i = 0; i < rows; i++) {
            inner:for (int j = 0; j < columns; j++) {
                if(i == 0 || j == 0 || i == rows - 1 || j == columns - 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
