class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutes(result, nums, 0);
        return result;
    }
    
    private void permutes(List<List<Integer>> result, int[] nums, int index) {
        if (index == nums.length) {
            List<Integer> end = new ArrayList<>();
            for (int num : nums) {
                end.add(num);
            }
            result.add(end);
            return;
        }
        for (int i = index; i < nums.length; ++i) {
            swap(nums, i, index);
            permutes(result, nums, index+1);
            swap(nums, i, index);
        }
    }
    
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}