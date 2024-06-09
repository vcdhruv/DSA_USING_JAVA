package Stacks;

import java.util.Stack;

public class DuplicateBrackets {
    public static boolean isDuplicateBrackets(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')') {
                if(st.peek() == '('){
                    return true;
                }
                else{
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                st.push(ch);
            }
            // System.out.println("Stack for iteration "+i+" : "+st);
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "((a+b)+(c+d))";
        String s1 = "(a+b)+((c+d))"; // there are duplicate brackets in c+d;
        System.out.println("is duplicate bracket : "+isDuplicateBrackets(s));
        System.out.println("is duplicate bracket : "+isDuplicateBrackets(s1));
        
    }
}
