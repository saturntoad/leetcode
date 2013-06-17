public class Solution {
    public int search(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return binSearch(A, 0, A.length, target);
    }
    
    private int binSearch(int[] A, int begin, int end, int target) {
        if (end - begin < 1)
            return -1;
        if (end - begin == 1) {
            if (A[begin] == target)
                return begin;
            return -1;
        }
        int middle = (end - begin) / 2 + begin;
        if (A[begin] == A[middle - 1]) {
            if (A[begin] == target)
                return begin;
            return binSearch(A, middle, end, target);
        }
        if (A[begin] < A[middle - 1]) {
            if (A[begin] > target || A[middle - 1] < target)
                return binSearch(A, middle, end, target);
            return binSearch(A, begin, middle, target);
        }
        else {
            if (A[begin] > target && A[middle - 1] < target)
                return binSearch(A, middle, end, target);
            return binSearch(A, begin, middle, target);
        }
    }
}