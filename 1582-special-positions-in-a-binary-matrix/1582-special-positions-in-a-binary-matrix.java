class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
       int R = mat.length;
       int C = mat[0].length;
        int[] row = new int[R];
        int[] col = new int[C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
                if(mat[i][j]==1)
                {
                    row[i]++;
                    col[j]++;
                }
            
        }
         for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
                if(mat[i][j]==1 && row[i]==1 && col[j]==1)
                {
                    count++;
                }
            
        }
        return count;
    }
}