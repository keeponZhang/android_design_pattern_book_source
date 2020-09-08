package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/21.
 */
public class findLUSlength {
    public int findLUSlength(String[] strs) {

        return 0;
    }

    public int findLUSlength(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        if(lenA != lenB)
            return Math.max(lenA,lenB);
        else{
            if(a.equals(b))
                return -1;
            else
                return lenA;
        }
    }
}
