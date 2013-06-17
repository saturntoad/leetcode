public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int curPos = m + n - 1;
        while (m > 0 || n > 0) {
            if (m == 0) {
                A[curPos] = B[n - 1];
                n--;
                curPos--;
                continue;
            }
            if (n == 0) {
                break;
            }
            if (A[m - 1] > B[n - 1]) {
                A[curPos] = A[m - 1];
                m--;
                curPos--;
            }
            else {
                A[curPos] = B[n - 1];
                n--;
                curPos--;
            }
        }
        return;
    }
}