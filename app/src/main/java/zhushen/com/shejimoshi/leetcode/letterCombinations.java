package zhushen.com.shejimoshi.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhushen on 2018/7/20.
 */
public class letterCombinations {
    public static void main(String[] args){

    }

    public List<String> letterCombinations(String digits) {
        Map<String,String> map = new HashMap<>();
        map.put("abc","2");
        map.put("def","3");
        map.put("ghi","4");
        map.put("jkl","5");
        map.put("mno","6");
        map.put("pqrs","7");
        map.put("tuv","8");
        map.put("wxyz","9");

        for(int i= 0;i<digits.length();i++){
            String str = digits.substring(i,i+1);

        }

        return null;
    }
}
