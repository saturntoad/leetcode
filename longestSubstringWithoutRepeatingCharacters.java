public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int map[] = new int[256];
        int maxlen = 0, curlen = 0, curstart = 0;
        for (int n = 0; n < 256; ++n)
            map[n] = -1;
        char cur = 0;
        for (int i = 0; i < s.length(); ++i) {
            cur = s.charAt(i);
            if (map[cur] == -1) {
                curlen++;
                map[cur] = i;
                if(maxlen < curlen)
                    maxlen = curlen;
            }
            else {
                curstart = i - curlen;
                for (int j = curstart; j < map[cur]; ++j) {
                    map[s.charAt(j)] = -1;
                }
                curstart = map[cur] + 1;
                curlen = i - curstart + 1;
                map[cur] = i;
            }
        }
        return maxlen;
    }
}