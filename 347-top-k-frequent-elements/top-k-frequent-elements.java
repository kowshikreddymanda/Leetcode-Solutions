class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            freq[i] = count;
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            int max = -1;
            int index = -1;

            for (int j = 0; j < n; j++) {
                if (freq[j] > max) {
                    max = freq[j];
                    index = j;
                }
            }

            result[i] = nums[index];

            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[index]) {
                    freq[j] = -1;
                }
            }
        }

        return result;
    }
}