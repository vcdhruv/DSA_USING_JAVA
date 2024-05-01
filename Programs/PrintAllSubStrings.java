package Programs;

import java.util.Scanner;

public class PrintAllSubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.next();
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                if( i == j ) continue;
                System.out.print(str.substring(i, j) + "\t");
            }
        }
        System.out.println(str.substring(0,str.length()));
    }
}
