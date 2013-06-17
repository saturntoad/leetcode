public class Solution {
    public int[] searchRange(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] r = new int[2];
        r[0] = searchRangeLeft(A, 0, A.length, target);
        r[1] = searchRangeRight(A, 0, A.length, target);
        return r;
    }
    
    private int searchRangeLeft(int[] A, int begin, int end, int target) {
        if (end - begin < 1)
            return -1;
        if (end - begin == 1) {
            if (A[begin] == target)
                return begin;
            return -1;
        }
        int middle = (end - begin) / 2 + begin;
        if (A[middle - 1] >= target)
            return searchRangeLeft(A, begin, middle, target);
        return searchRangeLeft(A, middle, end, target);
    }
    
    private int searchRangeRight(int[] A, int begin, int end, int target) {
        if (end - begin < 1)
            return -1;
        if (end - begin == 1) {
            if (A[begin] == target)
                return begin;
            return -1;
        }
        int middle = (end - begin) / 2 + begin;
        if (A[middle] <= target)
            return searchRangeRight(A, middle, end, target);
        return searchRangeRight(A, begin, middle, target);
    }
    
    
}