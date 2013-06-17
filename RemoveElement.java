public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (A == null || A.length == 0)
            return 0;
        int last = A.length - 1;
        for (int i = 0 ; i < A.length ; ++i) {
            if (last < i)
                break;
            if (A[i] == elem) {
                A[i] = A[last];
                last--;
                i--;
            }
        }
        if (last < 0)
            return 0;
        return last+1;
    }
}