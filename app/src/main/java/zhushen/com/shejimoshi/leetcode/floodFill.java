package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/19.
 */
public class floodFill {

    //image = [[1,1,1],[1,1,0],[1,0,1]]
    //sr = 1, sc = 1, newColor = 2
    //输出: [[2,2,2],[2,2,0],[2,0,1]]

    //1     1   1
    //1     1   0
    //1     0   1

    //sr = 1 sc = 1

    //2     2      2
    //2     2       0
    //2     0       1

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int old=image[sr][sc];
        if(old==newColor)
            return image;
        image[sr][sc]=newColor;
        if(sr-1>=0&&image[sr-1][sc]==old)
            image=floodFill(image,sr-1,sc,newColor);
        if(sc-1>=0&&image[sr][sc-1]==old)
            image=floodFill(image,sr,sc-1,newColor);
        if(sr+1<image.length&&image[sr+1][sc]==old)
            image=floodFill(image,sr+1,sc,newColor);
        if(sc+1<image[sr].length&&image[sr][sc+1]==old)
            image=floodFill(image,sr,sc+1,newColor);
        return image;
    }
}
