package Programs;

public class NumberOfPalindrominSubstrings {
    public static void main(String[] args) {
        String str = "aaa";
        int count = 0;
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                if (i == j) continue;
                // System.out.print(str.substring(i, j) + " ");
                StringBuilder sb = new StringBuilder(str.substring(i, j));
                if(str.substring(i, j).equals(sb.reverse().toString())) count++;
            }
        }
        System.out.println("Count : " + count);
    }
}
