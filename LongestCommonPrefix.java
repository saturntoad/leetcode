public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (strs == null || strs.length < 1)
            return "";
        if (strs.length == 1)
            return strs[0];
        int min = strs[0].length();
        for (int i = 0 ; i < strs.length ; ++i)
            if (strs[i].length() < min)
                min = strs[i].length();
        char c;
        int end = 0;
        boolean stop = false;
        for (; end < min ; ++end) {
            c = strs[0].charAt(end);
            for (int j = 1 ; j < strs.length ; ++j) {
                if (strs[j].charAt(end) != c) {
                    stop = true;
                    break;
                }
            }
            if (stop == true)
                break;
        }
        return strs[0].substring(0, end);
            
    }
}
