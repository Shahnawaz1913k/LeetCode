class Solution {
    public String convert(String s, int numRows) {
        Map<Integer,StringBuilder> map = new HashMap<>();
        int pos = 0;
        boolean inc = true;
        for(char c : s.toCharArray())
        {
            if(pos == numRows) inc = false;
            if(pos == 1) inc = true;
            if(inc) pos++;
            else
                pos--;
            if(!map.containsKey(pos))
                map.put(pos,new StringBuilder());
            map.get(pos).append(c);
        }
        StringBuilder res = new StringBuilder();
        for(int i : map.keySet())
        {
            res.append(map.get(i));
        }
        return res.toString();
    }
}