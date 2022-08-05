class Solution {
    int[] dp;
    public int combinationSum4(int[] nums, int target) {
        dp = new int[target+1];
        Arrays.fill(dp,-1);
        dp[0] = 1;
        solve(nums,target);
        return dp[target];
    }
    int solve(int[] nums, int target)
    {
        if(dp[target]>-1)
            return dp[target];
        int res = 0;
        for(int i:nums){
            if(i<=target){
                res+= solve(nums,target-i);
            }
        }
        dp[target]=res;
        return dp[target];
            
    }
}