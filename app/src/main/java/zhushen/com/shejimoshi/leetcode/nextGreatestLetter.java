package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/13.
 */
public class nextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int min = Integer.MAX_VALUE;
        int temp = 0;
        for (char c:letters) {
            int i = c - target;
            if(i>0){
                min = Math.min(min,i);
            }
            temp = Math.min(temp,i);
        }

        if(min == Integer.MAX_VALUE){
            return (char) (target + temp);
        }
        return (char) (target+min);
    }
}
