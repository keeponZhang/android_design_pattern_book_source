package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/29.
 */
public class countBinarySubstrings {

    public int countBinarySubstrings(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int[] group = new int[len];
        int index = 0;
        group[0] = 1;
        for(int i=0;i<len-1;i++){
            if(chars[i]!=chars[i+1]){
                group[++index] = 1;
            }else{
                group[index]++;
            }
        }
        int res = 0;
        for(int i=0;i<index;i++){
            res = res + Math.min(group[i],group[i+1]);
        }
        return res;
    }
}
