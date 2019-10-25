class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] lp = new int[nums.length];
        int[] rp = new int[nums.length];
        int l = 0, r = nums.length-1;
        lp[l++] = rp[r--] = 1;
        while (l < nums.length && r >= 0) {
            lp[l] = lp[l-1]*nums[l-1];
            rp[r] = rp[r+1]*nums[r+1];
            l++;
            r--;
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            result[i] = lp[i]*rp[i];
        }
        return result;
    }
}