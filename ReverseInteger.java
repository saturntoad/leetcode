public class Solution {
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (x == 0)
            return 0;
        boolean negative = false;
        if (x < 0) {
            negative = true;
            x = -1 * x;
        }
        StringBuilder sb = new StringBuilder();
        while (x != 0) {
            sb.append(x % 10);
            x /= 10;
        }
        x = sb.charAt(0) - '0';
        for(int i = 1; i < sb.length(); ++i) {
            x *= 10;
            x += sb.charAt(i) - '0';
        }
        if (negative == true)
            x = -1 * x;
        return x;
    }
}