public class Solution {
    public boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s.length() == 0) {
           return true; 
        }
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (true) {
            if ( j < 0 || i > s.length() - 1)
                return true;
            while(i < s.length() && Character.isLetterOrDigit(s.charAt(i)) == false)
                ++i;
            while(j >= 0 && Character.isLetterOrDigit(s.charAt(j)) == false)
                --j;
            if ( j < i ) 
                return true;
            if ( s.charAt(i) != s.charAt(j) )
                return false;
            ++i;
            --j;
        }
    }
}