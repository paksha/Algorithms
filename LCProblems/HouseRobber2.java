class Solution {
	private int rob_help(int nums[], int start, int end) {
		if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
		int prev2 = 0;
        int prev1 = 0;
		for (int i = start; i < end; ++i) {
			int tmp = prev1;
			prev1 = Math.max(prev2+nums[i], prev1);
			prev2 = tmp;
		}
		return prev1;
	}
    public int rob(int nums[]) {
        return Math.max(rob_help(nums, 0, nums.length-1), 
                        rob_help(nums,1,nums.length));
    }
}