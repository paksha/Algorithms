class Solution {
    public int firstMissingPositive(int[] nums) {
        int curr = 1;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) set.add(nums[i]);
        }
        while (set.contains(curr)) {
            curr++;
        }
        return curr;
    }
}