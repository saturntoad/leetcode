public class Solution {
    public boolean isPalindrome(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (x < 0) 
            return false;
        if (x < 10)
            return true;
        int len = 0;
        int y = x;
        while (x != 0) {
            x /= 10;
            len++;
        }
        for (int i = 0; i < len / 2 ; ++i) {
            if ( checkDigitByOffset(y, len, i) == false )
                return false;
        }
        return true;
    }
    
    private boolean checkDigitByOffset(int x, int len, int i) {
        int begin = len / 2 - i - 1;
        while(begin > 0) {
            x /= 10;
            begin--;
        }
        int right = x % 10;
        x /= 10;
        while(i > 0) {
            x /= 100;
            i--;
        }
        if (len % 2 != 0)
            x /= 10;
        if (x % 10 == right)
            return true;
        return false;
    }
}