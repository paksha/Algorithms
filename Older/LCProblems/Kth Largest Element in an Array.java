class Solution {
    public int findKthLargest(int[] nums, int k) {
        int low = 0, high = nums.length-1;
        k = nums.length-k;
        while (low < high) {
            int x = lomuto(nums, low, high);
            if (x == k) break;
            if (x < k) low = x + 1;
            if (x > k) high = x-1;
        }
        return nums[k];
    }
    
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    private static int lomuto(int[] a, int low, int high) {
        int pivot = a[high], pivotloc = low;
        for (int i = low; i < high; ++i) {
            if (a[i] <= pivot) {
                swap(a,i,pivotloc);
                pivotloc++;
            }
        }
        swap(a,pivotloc,high);
        return pivotloc;
    }
}