package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/26.
 */
public class surfaceArea {
    public int surfaceArea(int[][] grid) {
        int count=0;
        int discount=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++){
            count+=grid[i][j];//总块数
            if(grid[i][j]>1){
                discount+=grid[i][j]-1;
            }
            if((j<(grid[0].length-1))&&(grid[i][j+1]!=0)){
                discount+=Math.min(grid[i][j+1],grid[i][j]);
            }
            if((i<(grid.length-1))&&(grid[i+1][j]!=0)){
                discount+=Math.min(grid[i+1][j],grid[i][j]);
            }
        }
        count=count*6;
        //总表面积
        int surface=count-discount*2;
        return surface;

    }
}
