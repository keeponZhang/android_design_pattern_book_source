package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/13.
 */
public class lengthOfLastWord {
    public static void main(String[] args){
        int i = lengthOfLastWord(" ");
        String s = "";

    }


    public static int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        if(strings.length == 0){
            return 0;
        }
        return strings[strings.length-1].length();
    }
}
