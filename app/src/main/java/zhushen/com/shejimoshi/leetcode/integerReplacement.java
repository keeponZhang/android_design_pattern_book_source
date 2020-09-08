package zhushen.com.shejimoshi.leetcode;

import static java.lang.Math.min;

/**
 * Created by Zhushen on 2018/8/16.
 */
public class integerReplacement {
    int integerReplacement(int n) {
        if(n==1){
            return 0;                            //如果是1，返回0
        }
        if(n%2==0){
            return integerReplacement(n/2)+1;    //如果是偶数，变成n/2进行处理，次数加一
        }
        else{                                    //如果是奇数，那么进行下面的判断
            if(n==Integer.MAX_VALUE){
                return integerReplacement(n-1);              //这是个坑点，刚开始没有想到。如果再加一就要超过int的范围了
            }
            return Math.min(integerReplacement(n-1)+1,integerReplacement(n+1)+1);  //两种方法路径，返回次数最小的那一个。
        }
    }
}
