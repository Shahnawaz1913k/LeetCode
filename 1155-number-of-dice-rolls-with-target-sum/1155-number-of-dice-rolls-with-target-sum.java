class Solution {
    final int MOD = 1000000007;
    HashMap<String, Integer> hm = new HashMap<>();
    public int numRollsToTarget(int n, int k, int target) {
        if(target<n || target>n*k)
            return 0;
        if(n==1) return (target<=k) ?1:0;
        String key = ""+n+k+target;
        if(!hm.containsKey(key))
        {
        int sum =0;
        for(int i=1;i<=k;i++)
        {
            sum+=numRollsToTarget(n-1,k,target-i);
            sum%=MOD;
        }
            hm.put(key,sum);
        }
        return hm.get(key);
    }
}