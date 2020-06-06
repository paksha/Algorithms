class Solution {
    static int first(int[] nums, int low, int high, int x) {
        if (high >= low) {
            int mid = (low+high)/2;
            if ((mid == 0 || nums[mid-1] < x) && nums[mid] == x) {
                return mid;
            } else if (nums[mid] < x) {
                return first(nums, mid+1, high, x);
            } else {
                return first(nums, low, mid-1, x);
            }
        }
        return -1;
    }
    
    static int last(int[] nums, int low, int high, int x, int n) {
        if (high >= low) {
            int mid = low + (high-low)/2;
            if ((mid == n-1 || nums[mid+1] > x) && nums[mid] == x) {
                return mid;
            } else if (x < nums[mid]) {
                return last(nums, low, mid-1, x, n);
            } else {
                return last(nums, mid+1, high, x, n);
            }
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        int i, j;
        i = first(nums, 0, nums.length-1, target);
        if (i == -1) return new int[]{-1,-1};
        j = last(nums, 0, nums.length-1, target, nums.length);
        return new int[]{i,j};
    }
}