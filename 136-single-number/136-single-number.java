class Solution {
    public int singleNumber(int[] nums) {
        int ans;
      Map<Integer,Integer> hm = new HashMap<>();
        for(int i : nums)
            hm.put(i,hm.getOrDefault(i,0)+1);
        for (Map.Entry<Integer,Integer> entry : hm.entrySet())
		{
			if(entry.getValue()==1)
				return entry.getKey();
		}
        return 0;
    }
}