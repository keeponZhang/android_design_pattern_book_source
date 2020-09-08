package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/8/21.
 */
public class numIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0 ;

        int row = grid.length;//行数
        int column = grid[0].length;//列数

        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1'){
                    count ++;
                    combine(grid,i,j);
                }
            }
        }
        return count;

    }

    public static void combine(char[][] grid, int x, int y){

        grid[x][y] = '2';
        if (x > grid.length-1 && y > grid[0].length-1 ) {
            return;
        }
        if (x < grid.length-1 && grid[x+1][y] == '1') {//向下
            combine(grid,x+1,y);
        }
        if (y < grid[0].length-1 && grid[x][y+1] == '1'){//向右
            combine(grid,x,y+1);
        }
        if (x > 0 && grid[x-1][y] == '1' ){//向上
            combine(grid,x-1,y);
        }
        if (y > 0 && grid[x][y-1] == '1') {//向左
            combine(grid,x,y-1);
        }
    }



    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> llist = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        comeback(1,n,k,list,llist);
        return llist;
    }
    public void comeback(int temp, int n, int k,List<Integer> list,List<List<Integer>> llist){
        if (list.size() == k) {
            llist.add(new ArrayList<Integer>(list));//这里必须是new一个。如果直接是list的话会发现最后是空的，因为list最后都被清空了。
            return;
        }
        for (int i = temp; i <= n; i++) {
            list.add(i);
            comeback(i+1,n,k,list,llist);
            list.remove(list.size()-1);
        }
    }
}
