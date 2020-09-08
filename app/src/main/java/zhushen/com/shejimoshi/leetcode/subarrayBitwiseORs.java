package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Zhushen on 2018/10/31.
 */
public class subarrayBitwiseORs {
    // 1 2 4

    //1
    //1  3  2
    //

    public static int subarrayBitwiseORs(int[] A) {
        int length = A.length;
        Set<Integer> u = new HashSet<>();
        Set<Integer> ans = new HashSet<>();

        for (int i = 0; i <length ; i++) {
            Set<Integer> v = new HashSet<>();
            v.add(A[i]);
            for (int x:u) {
                v.add(A[i]|x);
            }
            ans.addAll(v);
            u = v;
        }
        return ans.size();
    }

    public List<Integer> subarrayBitwiseORs(int[] A,int end){
        if(end == 0){
            List<Integer> list = new ArrayList<>();
            list.add(A[0]);
        }
        List<Integer> list = subarrayBitwiseORs(A,end-1);
        for (int i = 0; i <end; i++) {

        }
        return list;
    }

    public static void main(String[] args){
        int[] nums = new int[]{0};
        int x =  subarrayBitwiseORs(nums);
        int y = 0;
    }
}
