class SubarraySum {
	public static void subArraySum(int arr[], int sum) {
		HashMap<Integer, Integer> sums = new HashSet<>();
		int currSum = 0; // maintains current sum
		for (int i = 0; i < len; ++i) {
			currSum += arr[i];
			if (currSum == sum) {
				System.out.println("Sum found between indices 0 to " + i);
				return;
			}
			if (sums.containsKey(currSum-sum)) {
				System.out.println("Sum found between indices "+(sums.get(currSum-sum)+1)+" to "+i+"\n");
				return;
			}
			sums.put(currSum, i);
		}
		System.out.println("No subarray with given sum exists!");
	}
}