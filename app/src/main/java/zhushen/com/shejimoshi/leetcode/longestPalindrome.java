package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/16.
 */
public class longestPalindrome {
    public static void main(String[] args){

    }

    private int longestPalindrome(String s){
        // Write your code here
        if(s == null || s.length() == 0){
            return 0;
        }
        boolean hasOod = false;
        int[] record = new int[52];
        for(int i = 0;i<record.length;i++){
            record[i] = 0;
        }
        for(int i = 0;i<s.length();i++){
            char temp = s.charAt(i);
            if(Character.isUpperCase(temp)){
                record[temp - 'A' + 0]++;
            }else{
                record[temp - 'a' + 26]++;
            }
        }
        int result = 0;
        for(int i = 0;i<record.length;i++){
            result += (record[i]/2)*2;
            if(record[i]%2 == 1){
                hasOod = true;
            }
        }
        if(hasOod) result++;
        return result;

    }

}
