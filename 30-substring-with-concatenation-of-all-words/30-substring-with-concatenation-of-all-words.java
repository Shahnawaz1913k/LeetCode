class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<Integer>();
        int len = words[0].length();
        Map<String , Integer> map = new HashMap<>();
        for(String word : words)
            map.put(word, map.getOrDefault(word,0)+1);
        for(int i = 0;i<=s.length() - len*words.length;i++)
        {
            Map<String, Integer> copyMap = new HashMap<String, Integer>(map);
            for(int j=0;j<words.length;j++)
            {
                String str = s.substring(i+j*len,i+j*len+len);
                if(copyMap.containsKey(str))
                {
                    if(copyMap.get(str) == 1)
                        copyMap.remove(str);
                    else
                        copyMap.put(str,copyMap.get(str)-1);
                    if(copyMap.isEmpty()){
                        ans.add(i);
                        break;
                    }
                   
                }
                 else
                        break;
            }
        }
        return ans;
    }
}