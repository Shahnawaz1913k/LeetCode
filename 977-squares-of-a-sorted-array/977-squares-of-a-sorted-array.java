class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] res = new int[nums.length];
        int L = 0;
        int R = nums.length-1;
        int i = nums.length-1;
        while(L<=R)
        {
            if(nums[L]*nums[L] > nums[R]*nums[R])
            {
                res[i] = nums[L]*nums[L];
                i--;
                L++;
            }
            else{
                res[i] = nums[R]*nums[R];
                i--;
                R--;
            }
        }
        return res;
    }
}