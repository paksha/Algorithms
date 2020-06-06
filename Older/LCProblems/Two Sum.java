class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> encountered = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (encountered.containsKey(target-nums[i])) {
                return new int[] {encountered.get(target-nums[i]), i};
            } else {
                encountered.put(nums[i], i);
            }
        }
        return null;
    }
}