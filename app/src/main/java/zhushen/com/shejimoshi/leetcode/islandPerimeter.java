package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/13.
 */
public class islandPerimeter {
    public static void main(String[] args){

    }

    public int islandPerimeter(int[][] grid) {
        int count=0;
        int leftCount = 0;
        int topCount = 0;
        for(int i=0;i<grid.length;i++){
            for (int j = 0;j<grid[0].length;j++){
                if(grid[i][j] ==1 ){
                    count ++;
                    if(i!=0&&grid[i-1][j]==1){
                        leftCount++;
                    }
                    if(j!=0&&grid[i][j-1]==1){
                        topCount ++;
                    }
                }
            }
        }

        return count*4 - leftCount *2 - topCount*2;
    }
}
