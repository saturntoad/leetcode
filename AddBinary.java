public class Solution {
    public String addBinary(String a, String b) {
        // Start typing your Java solution below
        // DO NOT write main() function
        StringBuilder sb = new StringBuilder();
        int aLen = a.length(), bLen = b.length();        
        int shorter = aLen < bLen ? aLen : bLen;
        boolean carry = false;
        char aChar, bChar;
        for (int i = 0 ; i < shorter ; ++i) {
            aChar = a.charAt(aLen - i - 1);
            bChar = b.charAt(bLen - i - 1);
            if (carry == true) {
                if (aChar == '0') {
                    if (bChar == '0') {
                        sb.append('1');
                        carry = false;
                    }
                    else {
                        sb.append('0');
                    }
                }
                else {
                    if (bChar == '0') {
                        sb.append('0');
                    }
                    else {
                        sb.append('1');
                    }
                }
            }
            else {
                if (aChar == '0') {
                    if (bChar == '0') {
                        sb.append('0');
                    }
                    else {
                        sb.append('1');
                    }
                }
                else {
                    if (bChar == '0') {
                        sb.append('1');
                    }
                    else {
                        sb.append('0');
                        carry = true;
                    }
                }
            }
        }
        if (aLen > shorter) {
            for (int i = aLen - shorter - 1 ; i >= 0 ; --i) {
                aChar = a.charAt(i);
                if (carry == true) {
                    if (aChar == '0') {
                        sb.append('1');
                        carry = false;
                    }
                    else {
                        sb.append('0');
                    }
                }
                else {
                    sb.append(aChar);
                }
            }
        }
        if (bLen > shorter) {
            for (int i = bLen - shorter - 1 ; i >= 0 ; --i) {
                bChar = b.charAt(i);
                if (carry == true) {
                    if (bChar == '0') {
                        sb.append('1');
                        carry = false;
                    }
                    else {
                        sb.append('0');
                    }
                }
                else {
                    sb.append(bChar);
                }
            }
        }
        if (carry == true)
            sb.append('1');
        return sb.reverse().toString();
    }
}