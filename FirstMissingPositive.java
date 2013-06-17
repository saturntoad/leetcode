public class Solution {
    public int firstMissingPositive(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (A == null || A.length == 0)
            return 1;
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i = 0 ; i < A.length ; ++i) {
            if (A[i] > 0) {
                h.add(A[i]);
            }
        }
        int n = 1;
        while (true) {
            if (h.contains(n) == false)
                return n;
            n++;
        }
    }
}