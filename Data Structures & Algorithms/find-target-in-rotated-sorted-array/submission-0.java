class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int m;

        while(l<r){
            m = l + (r - l)/2;
            if(nums [m]>nums[r]) l = m + 1;
            else r =  m;
        }
        int pivot = l;

        int result = binarySearch(nums, target, 0, pivot - 1);
        if (result != -1) {
            return result;
        }

        return binarySearch(nums, target, pivot, n - 1);
    }

    public int binarySearch(int[] nums, int target, int l, int r){
        while(l<=r){
            int mid = l +(r-l)/2;
            if(nums[mid]==target) {
                return mid;
            } else if (nums[mid]<target) {
                l = mid + 1;
            } else {
                r = mid -1;
            }
        }
        return -1;
    }
}
