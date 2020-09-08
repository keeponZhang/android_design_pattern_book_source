package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/8/20.
 */
public class uncommonFromSentences {

    public String[] uncommonFromSentences(String A, String B) {
        String[] stringsA = A.split(" ");
        //将所有单词记录一遍
        Set<String> stringSet = new HashSet<>();
        //记录重复的
        Set<String> replace = new HashSet<>();
        for (String a : stringsA) {
            if (!stringSet.add(a)) {
                replace.add(a);
            }
        }
        String [] stringsB = B.split(" ");
        for (String b : stringsB) {
            if (!stringSet.add(b)) {
                replace.add(b);
            }
        }
        //从一遍中删除掉重复的
        for (String rep : replace) {
            if (stringSet.contains(rep)) {
                stringSet.remove(rep);
            }
        }
        //赋值给string数组
        String[] result = new String[stringSet.size()];
        int[] index = {0};
        for (String str:stringSet) {
            result[index[0]] = str;
            index[0]++;
        }


        return result;
    }
}
