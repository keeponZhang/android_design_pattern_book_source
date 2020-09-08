package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/15.
 */
public class reverseStr {
    public String reverseStr(String s, int k) {
        int len = s.length();
        char[] chars = s.toCharArray();
        int index = 0;
        while(index < len){
            if(len - index > k){
                for(int i = index,j = index + k -1;i<j;i++,j--){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
                index = index + 2*k;
            }else{
                for(int i = index,j = len-1;i<j;i++,j--){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
                index = len;
            }
        }
        return new String(chars);

    }
}
