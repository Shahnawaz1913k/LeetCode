class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int[] sum = new int[cardPoints.length];
        int Sum = 0;
        for(int i=0;i<cardPoints.length;i++)
        {
            Sum += cardPoints[i];
            sum[i] = Sum;
        }
        if(cardPoints.length == k)
            return Sum;
        int score = 0;
        int ans = 0;
        for(int i=0;i<=k;i++)
        {
            int j = i+cardPoints.length-k-1;
            if(i==0)
                ans = sum[j];
            else
                ans = sum[j]-sum[i-1];
              score= Math.max(score,Sum-ans);  
        }
        return score;
    }
}