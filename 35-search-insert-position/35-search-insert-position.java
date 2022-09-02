class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid=0;
        int l=0;
        int h= nums.length-1;
        while(l<=h)
        {
            mid = l+(h-l)/2;
            if (nums[mid] == target)
                return mid;
            else if(nums[mid]>target)
                h = mid-1;
            else
                l = mid+1;
        }
        return l;
        }
           
    
}