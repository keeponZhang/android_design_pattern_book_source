package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/21.
 */
public class maxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(1==grid[i][j])
                    max=Math.max(max,DfsApply(grid,i,j));
            }
        }
        return max;
    }
    public int DfsApply(int[][]grid,int i,int j)
    {
        if(i>=0&&i<grid.length&&j>=0&&j<grid[0].length&&grid[i][j]==1)
        {
            grid[i][j]=0;
            return 1+DfsApply(grid,i+1,j)+DfsApply(grid,i-1,j)+DfsApply(grid,i,j+1)+DfsApply(grid,i,j-1);
        }
        else return 0;
    }

}
