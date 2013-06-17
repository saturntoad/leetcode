public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] C = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m || j < n) {
            if (i >= m) {
                C[k] = B[j];
                j++;
                k++;
                continue;
            }
            if (j >= n) {
                C[k] = A[i];
                i++;
                k++;
                continue;
            }
            if (A[i] >= B[j]) {
                C[k] = B[j];
                j++;
                k++;
            }
            else {
                C[k] = A[i];
                i++;
                k++;
            }
        }
        for (int a = 0; a < k; ++a) {
            A[a] = C[a];
        }
        return;
    }
}