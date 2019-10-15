class Solution {
    public int pivotIndex(int[] nums) {
        int lsum = 0, rsum = 0;
        for (int num : nums) rsum += num;
        for (int i = 0; i < nums.length; ++i) {
            lsum += nums[i];
            if (lsum == rsum) return i;
            rsum -= nums[i];
        }
        return -1;
    }
}