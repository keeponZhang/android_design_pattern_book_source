package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/10/11.
 */
public class permute {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> l=new ArrayList<Integer>();
        digui(nums,l,res);
        return res;
    }

    public void digui(int[] a,List<Integer> l,List<List<Integer>> ll){
        if(l.size()==a.length){
            //注意，不能是ll.add(l);
            ll.add(new ArrayList<Integer>(l));
        }else{
            for(int i=0;i<a.length;i++){
                if(l.contains(a[i]))
                    continue;
                l.add(a[i]);
                digui(a,l,ll);
                //递归完删除list最后一项
                l.remove(l.size()-1);
            }
        }
    }

}
