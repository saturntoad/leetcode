public class Solution {
    public String longestPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s.length() < 3)
            return s;
        int maxLen = 0, curOff = 0;
        int a = 0, b = 0;
        for (int i = 0; i < s.length(); ++i) {
            curOff = 1;
            while (i - curOff >= 0 && i + curOff < s.length()) {
                if (s.charAt(i - curOff) == s.charAt(i + curOff))
                    curOff++;
                else
                    break;
            }
            curOff--;
            if (maxLen < curOff * 2 + 1) {
                maxLen = curOff * 2 + 1;
                a = i - curOff;
                b = i + curOff;
            }

            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i+1) ) {
                curOff = 1;
                 while (i - curOff >= 0 && i + 1 + curOff < s.length()) {
                    if (s.charAt(i - curOff) == s.charAt(i + 1 + curOff))
                        curOff++;
                    else
                        break;
                }
                curOff--;
                if (maxLen < curOff * 2 + 2) {
                    maxLen = curOff * 2 + 2;
                    a = i - curOff;
                    b = i + 1 + curOff;
                }
            }
            
            
            
        } 
        return s.substring(a, b+1);
    }
}