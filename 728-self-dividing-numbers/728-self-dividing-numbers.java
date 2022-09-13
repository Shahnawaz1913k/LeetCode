class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = left;i<=right;i++)
        {
            int val = i;
            while(val>0)
            {
                int digit = val%10;
                if(digit == 0 || i%digit !=0)
                    break;
             val/=10;   
            }
            if(val == 0)
                ans.add(i);
        }
        return ans;
    }
}