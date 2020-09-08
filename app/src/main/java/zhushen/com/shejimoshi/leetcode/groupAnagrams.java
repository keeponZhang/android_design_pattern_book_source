package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhushen on 2018/8/27.
 */
public class groupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return  new ArrayList<List<String>>();

        Map<String,List<String>> map = new HashMap<String, List<String>>();
        for (String s:strs){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);        //从小到大排序
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)){
                map.put(keyStr,new ArrayList<String>());
            }
            map.get(keyStr).add(s);
        }

        return  new ArrayList<List<String>>(map.values());

    }

}
