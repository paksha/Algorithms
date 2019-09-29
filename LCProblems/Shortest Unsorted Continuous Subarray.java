class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int start = 0;
        int end = 0;
        // find first violating index
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i+1]) {
                start = i;
                break;
            }
        }
        // find first violating index from the end
        for (int i = nums.length-1; i > 0; --i) {
            if (nums[i] < nums[i-1]) {
                end = i;
                break;
            }
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int j = start; j <= end; j++) {
            if (nums[j] < min) min = nums[j];
            if (nums[j] > max) max = nums[j];
        }
        int start_copy = start;
        int end_copy = end;
        for (int i = 0; i < start_copy; ++i) {
            if (nums[i] > min) {
                start = i;
                break;
            }
        }
        for (int i = nums.length-1; i > end; --i) {
            if (nums[i] < max) {
                end = i;
                break;
            }
        }
        return (end == 0) ? 0 : end-start+1;
    }
}