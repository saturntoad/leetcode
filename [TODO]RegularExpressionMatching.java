public class Solution {
    public boolean isMatch(String s, String p) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int lens = s.length();
        int lenp = p.length();
        if (lens == 0 && lenp == 0) 
            return true;
        if (lenp == 0)
            return false;
        if (lenp > 1 && p.charAt(1) == '*') {
            if (isMatch(s, p.substring(2, lenp)) )        //.* matches nothing
                return true;
            if (lens == 0)
                return false;
            if (p.charAt(0) != '.' && s.charAt(0) != p.charAt(0))
                return false;
            if (isMatch(s.substring(1, lens), p.substring(2, lenp)))  //.* matches exactly one char
                return true;
            return  isMatch(s.substring(1, lens), p);
        }
        else {
            if (lens == 0 || p.charAt(0) != '.' && p.charAt(0) != s.charAt(0))
                return false;
            return isMatch(s.substring(1, lens), p.substring(1, lenp));
                
        }
    }
}