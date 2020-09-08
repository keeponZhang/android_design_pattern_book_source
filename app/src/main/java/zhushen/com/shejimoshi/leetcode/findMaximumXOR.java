package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/9/7.
 */
public class findMaximumXOR {
    public int findMaximumXOR(int[] nums) {
        if (nums.length < 2) return 0;
        int maxNum = 0;
        int flag = 0;
        //本题关键在于，最终最大的异或结果一定是由所有数中，高位最先为1的数（也就是最大的数）参与得到的。
        for (int i = 31; i >= 0; --i){//从最大值maxNum最高位到最低位开始确定</span>
            Set<Integer> hash = new HashSet<>();
            flag |= (1 << i);    //利用flag取出每一个x的前n-i位，n为31
            for (int x : nums){
                hash.add(flag & x);   //将取出来的每一种前n-i位存入到集合中，以备接下来比较。
            }

            int tmp = maxNum | (1 << i);  //maxNum为上一次比较得出的前n-i位最大的数值，利用tmp尝试，若紧邻的下一位为1，是否有可能？
            for (int x : hash){
                //此处用到了x1^tmp=x2,则x1^x2=tmp.原因：x1^tmp=x2,两边同时异或x1,则tmp=x1^x2.
                //如果存在，就说明有一个数的前n-i位与另一个数的前n-i位异或结果为该maxNum
                if (hash.contains(x ^ tmp))  {
                    maxNum = tmp;
                    break;
                }
            }
        }
        return maxNum;

    }
}
