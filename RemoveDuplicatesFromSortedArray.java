public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (A == null || A.length == 0)
            return 0;
        int count = 1, current = A[0];
        for (int i = 1 ; i < A.length ; ++i) {
            if (A[i] != current) {
                A[count] = A[i];
                count++;
                current = A[i];
            }
        }
        return count;
    }
}