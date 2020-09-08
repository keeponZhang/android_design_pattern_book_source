package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/7/24.
 */
public class hIndex {
    public static void main(String[] args){
        int[] citations = new int[]{100};
        int result = hIndex(citations);
        int x = 0;
    }

    //0 1 3 5 6
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int level = 0;
        for(int i = 0; i < citations.length; i++)
            level = Math.max(level,Math.min(citations.length - i,citations[i]));
        return level;
    }
}
