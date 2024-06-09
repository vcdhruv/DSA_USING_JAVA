package Stacks;
import java.util.Stack;
public class BalancedBrackets {
    public static boolean handleClosing(Stack<Character> st , char ch){
        if(st.size() == 0){
            return false;
        }else if(st.peek() != ch){
            return false;
        }else{
            st.pop();
            return true;
        }
    }
    public static void isBalanced(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else if (ch == ')') {
                boolean val = handleClosing(st, '(');
                if (val == false) {
                    System.out.println(false);
                    return;
                }
            }else if(ch == '}'){
                boolean val = handleClosing(st, '{');
                if (val == false) {
                    System.out.println(false);
                    return;
                }
            }else if(ch == ']'){
                boolean val = handleClosing(st, '[');
                if (val == false) {
                    System.out.println(false);
                    return;
                }
            }
            // System.out.println("Stack for iteration "+i+" is : "+st);
        }
        if(st.size() == 0){
            System.out.println(true); 
            return;
        }else{
            System.out.println(false); // opening brackets are more
            return;
        }

    }
    public static void main(String[] args) {
        isBalanced("[(a+b)+{(c+d)*(e/f)}]");
        isBalanced("[(a+b)+{(c+d)*(e/f)]}");
        isBalanced("[(a+b)+{(c+d)*(e/f)}");
        isBalanced("([(a+b)+{(c+d)*(e/f)}");


    }
}
