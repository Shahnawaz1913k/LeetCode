class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        if(arr.length == 0 || arr==null)
            return 0;
        Arrays.sort(arr);
        Map<Integer,Long> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            long count =1l;
            for(int j=0;j<i;j++)
            {
                if(arr[i]%arr[j]==0 && hm.containsKey(arr[i]/arr[j]))
                    {
                        count += hm.get(arr[j]) * hm.get(arr[i]/arr[j]);
                    }
            } 
            hm.put(arr[i],count);
        }
        long total = 0l;
        for(Map.Entry<Integer,Long> entry : hm.entrySet()){
            total+=entry.getValue();
        }
        return (int)(total % (1000000000+7));
    }
}