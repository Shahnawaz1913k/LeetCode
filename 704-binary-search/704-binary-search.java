class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        return binarySearch(left,right,nums,target);
    }
    public int binarySearch(int left, int right, int[] nums,int target)
    {
        if (right >= left && left <=  nums.length - 1) {
        int mid = left +(right-left)/2;
        if(nums[mid] == target)
            return mid;
        if(nums[mid]>target)
            return binarySearch(left,mid-1,nums,target);
            
        return binarySearch(mid+1,right,nums,target);
        }
       return -1;     
    }
}