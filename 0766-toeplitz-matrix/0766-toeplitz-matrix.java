class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
     int m=matrix.length;
     int n=matrix[0].length;
        int a=1, b=1;
        int result = matrix[0][0];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i>0 && j>0 && matrix[i-1][j-1]!=matrix[i][j]) 
                return false;
            }
        }
        return true;
    }
}