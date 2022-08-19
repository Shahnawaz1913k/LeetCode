class Solution {
    public boolean isPossible(int[] nums) {
        HashMap<Integer,Integer> hm =  new HashMap<>(), fre = new HashMap<>();
	for(int i:nums)
	hm.put(i,hm.getOrDefault(i,0)+1);
	for(int i : nums)
	{
		if(hm.get(i)==0) continue;
		else if(fre.getOrDefault(i,0)>0) {
			fre.put(i, fre.get(i)-1);
			fre.put(i+1, fre.getOrDefault(i+1, 0)+1);
		}
		else if(hm.getOrDefault(i+1,0)>0 && hm.getOrDefault(i+2, 0)>0) {
			hm.put(i+1, hm.get(i+1)-1);
			hm.put(i+2, hm.get(i+2)-1);
			fre.put(i+3, fre.getOrDefault(i+3, 0)+1);
		}
		else
			return false;
		hm.put(i, hm.get(i)-1);
			
    }
        return true;
	}
	
}