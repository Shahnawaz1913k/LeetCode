class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int i = 0, j = tokens.length-1;
        int ans = 0;
        while(i<=j)
        {
            if(tokens[i] <= power)
            {
                score++;
                if(ans<score)
                    ans = score;
                power = power-tokens[i];
                i++;
            }
            else if(score>0)
            {
                score--;
                power = power + tokens[j];
                j--;
            }
            else
                break;
        }
        return ans;
    }
}