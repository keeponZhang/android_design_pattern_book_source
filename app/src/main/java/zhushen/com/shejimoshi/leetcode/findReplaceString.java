package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhushen on 2018/11/19.
 */
public class findReplaceString {
    //输入：S = "abcd", indexes = [0,2], sources = ["a","cd"], targets = ["eee","ffff"]
    //输出："eeebffff"
    //"a" 从 S 中的索引 0 开始，所以它被替换为 "eee"。
    //"cd" 从 S 中的索引 2 开始，所以它被替换为 "ffff"。

    //输入：S = "abcd", indexes = [0,2], sources = ["ab","ec"], targets = ["eee","ffff"]
    //输出："eeecd"
    //"ab" 从 S 中的索引 0 开始，所以它被替换为 "eee"。
    //"ec" 没有从原始的 S 中的索引 2 开始，所以它没有被替换。

    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> indList =new ArrayList<>();
        int n = indexes.length;
        for(int i = 0; i < n; i++) {
            map.put(indexes[i], i);
            indList.add(indexes[i]);
        }

        Collections.sort(indList);

        for(int i = n - 1; i >= 0; i--) {// 从右往左替换
            int pos = indList.get(i);
            int curInd = map.get(pos);
            if(S.indexOf(sources[curInd], pos) == pos) {// 检查sources[curInd]是否出现在指定pos，如果出现，则替换
                S = S.substring(0, pos) + targets[curInd] + S.substring(pos + sources[curInd].length());
            }
        }

        return S;
    }
}
