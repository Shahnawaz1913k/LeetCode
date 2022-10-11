class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int x: nums)
        {
        if(x<first)
            first=x;
        else if(x>first && x<second)
            second = x;
        else if(x>second)
            return true;
        }
        return false;
    }
}