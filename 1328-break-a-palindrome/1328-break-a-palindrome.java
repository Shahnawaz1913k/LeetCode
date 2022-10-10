class Solution {
    public String breakPalindrome(String palindrome) {
        char[] str = palindrome.toCharArray();
        int n = palindrome.length();
        if(n<=1)
            return "";
        for(int i=0;i<n/2;i++)
        {
            if(str[i] !='a'){
                str[i]= 'a';
                return String.valueOf(str);
            }    
        }
        str[n-1] = 'b';
        return String.valueOf(str);
    }
}