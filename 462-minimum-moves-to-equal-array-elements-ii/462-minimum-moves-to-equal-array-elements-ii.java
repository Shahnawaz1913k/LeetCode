class Solution {
    public int minMoves2(int[] nums) {
        int n =  nums.length;
        Arrays.sort(nums);
        int count = 0;
        int mid = n/2;
        for(int i =0 ;i<n;i++)
        {
            count = count+Math.abs((nums[mid]-nums[i]));
        }
        return count;
    }
    
}