class Solution {
    public int dfs(int i,int j,int[][] grid)
    {
        if(i>=grid.length)
            return j;
        //left to right
        if(grid[i][j]==1 && j+1<grid[0].length && grid[i][j+1]==1)
            return dfs(i+1,j+1,grid);
        //right to left
        else if(grid[i][j]==-1 && j-1>=0 && grid[i][j-1]==-1)
            return dfs(i+1,j-1,grid);
        else if(grid[i][j]==1 && j+1>=grid[0].length)
            return -1;
        else
            return -1;
        
        
    }
    public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        ArrayList<Integer> arr = new ArrayList<>();
        int[] al = new int [n];
        for(int j=0;j<n;j++)
            arr.add(dfs(0,j,grid));
        for(int i=0;i<n;i++)
            al[i] = arr.get(i);
        return al;
}
}