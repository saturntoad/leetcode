public class Solution {
    public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s == null || s.length() == 0)
            return 0;
        int i;
        int len = s.length();
        int last = len;
        boolean inWord = false;
        for (i = len - 1 ; i >= 0 ; --i) {
            if (Character.isSpace(s.charAt(i))) {
                if (inWord == true) {
                    break;
                }
                else {
                    last = i;
                }
            }
            else {
                inWord = true;
            }
        }
        if (inWord == false)
            return 0;
        return last - i - 1;
    }
}