class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer();
        for(int i=0;i<word1.length;i++)
        {
            str1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++)
        {
            str2.append(word2[i]);
        }
        String s1 = str1.toString();
        String s2 = str2.toString();
        if(s1.equals(s2))
            return true;
        return false;
    }
}