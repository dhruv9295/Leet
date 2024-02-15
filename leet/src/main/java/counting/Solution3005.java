package counting;

class Solution3005 {
	public int maxFrequencyElements(int[] nums) {
		int[] count = new int[100];
		int max = 0;
		int result = 0;
		for (int i : nums) {
			count[i - 1]++;
			if (count[i - 1] > max) {
				max = count[i - 1];
			}
		}
		for (int i : count) {
			if (i == max) {
				result += max;
			}
		}

		return result;
	}
}