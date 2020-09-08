package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/8/23.
 */
public class maxProduct {

    public static void main(String[] args){
        String[] words = new String[]{"abcw","baz","foo","bar","xtfn","abcdef"};
        int result = maxProduct(words);
        int x = 0;
    }

    public static int maxProduct(int[] nums) {
        int len = nums.length;
        if(len == 1 )return nums[0];

        int dp;
        int i,maxm,minm;
        int result;
        dp = maxm = minm = nums[0];
        for(i=1;i<len;i++){

            if(nums[i]>=0){
                maxm = Math.max(maxm*nums[i],nums[i]);
                minm = Math.min(minm*nums[i],nums[i]);
            }else{
                int tmp;
                tmp = maxm;
                maxm = Math.max(minm*nums[i],nums[i]);
                minm = Math.min(tmp*nums[i],nums[i]);
            }
            dp = Math.max(maxm,dp);
        }
        return dp;

    }

    //"abcw","baz","foo","bar","xtfn","abcdef"
    //abcw xtfn
    public static int maxProduct(String[] words) {
        int[][] temp = new int[words.length][26];

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j <words[i].length() ; j++) {
                temp[i][words[i].charAt(j)-'a'] = 1;
            }
        }
        int res = 0;

        for (int i = 1; i <words.length ; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < 26; k++) {
                    if(temp[i][k]==temp[j][k]){
                        continue;
                    }
                }
                res = Math.max(res,words[i].length()*words[j].length());
            }
        }

        return res;
    }
}
