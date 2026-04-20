class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums);
        return nums;
    }
     static void sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            int prev = i-1;
            while(prev  >= 0 && nums[prev] > curr){
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = curr;
        }
    }
}