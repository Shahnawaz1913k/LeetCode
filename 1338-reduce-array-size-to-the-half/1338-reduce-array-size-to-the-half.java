class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr)
            map.put(i,map.getOrDefault(i,0)+1);
       int[] fre = new int[map.values().size()];
        int i=0;
        for(int f:map.values())
            fre[i++] = f;
        Arrays.sort(fre);
        int ans =0;
        int n = arr.length/2;
        int remsum = 0;
        i = fre.length-1;
        while(remsum<n)
        {
            ans++;
            remsum+= fre[i--];
        }
        return ans;
    }
}