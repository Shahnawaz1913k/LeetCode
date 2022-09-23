class Solution {
    public int concatenatedBinary(int n) {
        long res = 0;
        int mod = 1_000_000_007;
        int i =1;
        while(i<=n)
        {
            String BinaryString = Integer.toBinaryString(i);
            res = (res<<BinaryString.length())%mod;
            res = (res+i)%mod;
            i++;
        }
        
        return (int)res;
    }  
}