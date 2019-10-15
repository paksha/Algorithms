class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0, result = 0;
        mp.put(0,1);
        for (int num : nums) {
            sum += num;
            result += mp.getOrDefault(sum-k, 0);
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}