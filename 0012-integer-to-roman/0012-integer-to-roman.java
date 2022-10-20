class Solution {
    public String intToRoman(int num) {
       String roman="";
        int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] notation = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        for(int pos = 0;num>0;++pos)
        {
            while(num>=value[pos])
            {
                roman+=notation[pos];
                num-=value[pos];
            }
        }
        return roman;
    }
}