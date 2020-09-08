package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/24.
 */
public class numMagicSquaresInside {
    //a b   c
    //d e   f
    //g h   i

    //a + i == g + c
    //d + f == b + h
    //d + g == e + i == b + c
    //a + b == e + g == f + i
    //438
    //951
    //276


    public int numMagicSquaresInside(int[][] grid) {
        //排除不够3X3的数组矩阵
        if (grid.length < 3){
            return 0;
        }
        int sum = 0;
        //找九宫格中间的数字
        for (int i = 1;i < grid.length - 1;i++){
            for (int j = 1;j < grid.length - 1;){
                //上述 条件1&&条件2
                if (grid[i][j] == 5&&isLawfulNum(grid,j,i)){
                    sum ++;
                    //如果当前九宫格满足条件意味着：
                    // 向右移动一位的九宫格中间的数字不是5
                    // 自己脑补一下把....
                    j += 2;
                }else {
                    j ++;
                }
            }
        }
        return sum;
    }
    private boolean isLawfulNum(int[][] grid,int x,int y) {
        int num1 = grid[y - 1][x - 1];
        int num2 = grid[y - 1][x];
        int num3 = grid[y][x - 1];
        int num4 = grid[y - 1][x + 1];
        int num5 = grid[y][x + 1];
        int num6 = grid[y + 1][x - 1];
        int num7 = grid[y + 1][x];
        int num8 = grid[y + 1][x + 1];
        //俩数相加必须等于10  还不能超过范围1—9，同时还不能是5，因此除5取余数来排除0，5，10
        if (num1 % 5 != 0 && num2 % 5 != 0 && num3 % 5 != 0 && num4 % 5 != 0)
            if (10 - num1 == num8 && 10 - num2 == num7 && 10 - num3 == num5 && 10 - num4 == num6)
                return true;
        return false;
    }
}
