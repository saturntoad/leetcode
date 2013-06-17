public class Solution {
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return binSearchInsert(A, 0, A.length, target);
    }
    
    private int binSearchInsert(int[] A, int begin, int end, int target) {
        if (end - begin < 1)
            return -1;
        if (end - begin == 1) {
            if (A[begin] >= target)
                return begin;
            return end;
        }
        int middle = (end - begin) / 2 + begin;
        if (A[middle - 1] >= target)
            return binSearchInsert(A, begin, middle, target);
        return binSearchInsert(A, middle, end, target);
    }
    
}