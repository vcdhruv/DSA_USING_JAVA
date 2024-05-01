package Programs;

import java.util.Scanner;

public class ReverseFunctionUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int i = 0 , j = sb.length() - 1;
        System.out.println(j);
        while (i < j) {
            // System.out.println(sb);
            char temp = ' ';
            char start = sb.charAt(i); // if abc then 'a'
            char end = sb.charAt(j); // if abc then 'c'
            temp = start; // temp = 'a'
            start = end; // start = 'c'
            end = temp; // end = 'a'
            sb.setCharAt(i, start); // at start first loop at 0 c will be set if str is abc
            sb.setCharAt(j, end); // at end first loop at 2 a will be set if str is abc
            i++;
            j--;
        }
        System.out.println(sb);
    }
}
