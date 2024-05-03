package Programs;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String s = "I am an cricketer";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }else{
                sb.reverse();
                sb.append(" ");
                ans += sb;
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        sb.delete(0, sb.length());
        System.out.println(ans);
    }
}
