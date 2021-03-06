class Solution {
    public boolean makesquare(int[] matchsticks) {
         Arrays.sort(matchsticks);
        int total = 0;
        for (int i = 0; i < matchsticks.length; i++)
            total += matchsticks[i];
        side = total / 4;
        if ((float)total / 4 > side || matchsticks[matchsticks.length-1] > side)
            return false;
        return btrack(matchsticks.length-1, side, 0, matchsticks);
    }
    private int side;
    private boolean btrack(int i, int space, int done, int[] M) {
        if (done == 3)
            return true;
        for (; i >= 0; i--) {
            int num = M[i];
            boolean res;
            if (num > space)
                continue;
            M[i] = side + 1;
            if (num == space)
                res = btrack(M.length-2, side, done+1, M);
            else
                res = btrack(i-1, space-num, done, M);
            if (res)
                return true;
            M[i] = num;
            while (i > 0 && M[i-1] == num)
                i--;
        }
        return false;
    }
}