package Programs;

public class NumberOfPalindromicSubstringsUsingString {
    public static boolean palindromeString(String str, int startIndex, int endIndex) {
        int start = startIndex;
        int end = endIndex;
        boolean flag = true; // true means plaindrome
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                flag = false;
            }
            start++;
            end--;
        }
        return flag == true ? true:false;
    }

    public static void main(String[] args) {
        String str = "abcba";
        // System.out.println(str.length());
        int count = 0;
        boolean flag = true;
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                if (i == j)
                    continue;
                String subString = str.substring(i, j);
                System.out.println(subString);
                if (subString.length() == 1) {
                    count++;
                } else {
                    boolean isPalindrome = palindromeString(str, i, j-1);
                    if(isPalindrome == true) count++;
                }
            }
        }
        System.out.println("Count : " + count);
    }
}
