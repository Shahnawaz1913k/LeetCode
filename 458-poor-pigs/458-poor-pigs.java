class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pig = 0;
     while(Math.pow(minutesToTest / minutesToDie+1,pig)<buckets)
         pig+=1;
        return pig;
    }
}