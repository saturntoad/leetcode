public class Solution {
    public void sortColors(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int red = 0, white = 0, blue = 0;
        for (int i = 0 ; i < A.length ; ++i) {
            if (A[i] == 0)
                red++;
            else if (A[i] == 1)
                white++;
            else
                blue++;
        }
        for (int i = 0 ; i < A.length ; ++i) {
            if (red > 0) {
                A[i] = 0;
                red--;
            }
            else if (white > 0) {
                A[i] = 1;
                white--;
            }
            else {
                A[i] = 2;
                blue--;
            }
        }
        return;
    }
}