package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/7/13.
 */
public class generate {
    public static  void  main(String[] args){
        test(5);
    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(numRows ==1){
            list.add(1);
        }else {
            result = generate(numRows-1);

            int num = 1;
            list.add(num);
            for(int i = 1;i<numRows;i++){
                num = num * (numRows-i) /(i);
                list.add(num);
            }
        }
        result.add(list);
        return result;
    }

    public static void test(int numRows){
        List<Integer> list = new ArrayList<>();
        int num = 1;
        list.add(num);
        for(int i = 1;i<numRows;i++){
            num = num * (numRows-i) /(i);
            list.add(num);
        }
    }
}
