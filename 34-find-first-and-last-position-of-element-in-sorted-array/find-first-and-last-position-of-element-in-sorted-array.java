class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurrence(nums, target);

        if(first == -1){
            return new int[]{-1, -1};
        }

        int last = lastOccurrence(nums, target);

        return new int[]{first, last};
    }

    private int firstOccurrence(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == target){
                ans = mid;
                high = mid - 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }

    private int lastOccurrence(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == target){
                ans = mid;
                low = mid + 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
}