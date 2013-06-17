public class Solution {
    public void sortColors(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int red = 0, white = 0, blue = A.length - 1;
        for (int i = 0 ; i < A.length ; ++i) {
            if (blue < white)
                break;
            if (A[i] == 0) {
                if (red != white) {
                    A[i] = 1;
                    A[red] = 0;
                }
                red++;
                white++;
                continue;
            }
            if (A[i] == 1) {
                white++;
                continue;
            }
            if (A[i] == 2) {
                A[i] = A[blue];
                A[blue] = 2;
                i--;
                blue--;
                continue;
            }
        }
        return;
    }
}