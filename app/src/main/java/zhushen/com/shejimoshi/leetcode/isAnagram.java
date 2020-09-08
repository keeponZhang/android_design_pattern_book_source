package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/31.
 */
public class isAnagram {
    public static void main(String[] args){

    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] nums = new int[26];
        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            int x = c - 'a';
            int y = t.charAt(i) - 'a';
            nums[x] ++;
            nums[y] --;
        }
        for (int num:nums) {
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}
