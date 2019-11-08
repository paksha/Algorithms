class Solution {
    public boolean isMonotonic(int[] A) {
        boolean inc = true, dec = true;
        for (int i = 1; i < A.length; ++i) {
            if (inc) inc = A[i-1] <= A[i];
            if (dec) dec = A[i-1] >= A[i];
        }
        return inc || dec;
    }
}