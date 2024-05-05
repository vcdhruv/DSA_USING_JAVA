import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = scn.nextLine();
        System.out.print(middle(s));
        }
    public static String middle(String s){
        if(s.length() % 2 == 0){
            return s.substring(s.length()/2-1, s.length()/2 + 1);
        }else{
            return s.charAt(s.length()/2)+"";
        }
    }
}
