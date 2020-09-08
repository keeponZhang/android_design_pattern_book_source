package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/9/13.
 */
public class largeGroupPositions {
    public static void main(String[] args){
        largeGroupPositions("aaa");
        int x = 0;
    }

    public static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> lists = new ArrayList<>();

        int start = 0;
        int count = 0;
        for (int i = 1; i <S.length() ; i++) {
            if(S.charAt(i-1) == S.charAt(i)){
                count++;
            }else {
                if(count>=2){
                    List<Integer> list = new ArrayList<>();
                    list.add(start);
                    list.add(start+count);
                    lists.add(list);
                }
                start = i;
                count = 0;
            }
        }
        if(count>=2){
            List<Integer> list = new ArrayList<>();
            list.add(start);
            list.add(start+count);
            lists.add(list);
        }
        return lists;
    }
}
