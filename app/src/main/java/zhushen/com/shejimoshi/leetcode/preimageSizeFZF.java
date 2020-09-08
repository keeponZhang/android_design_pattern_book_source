package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/30.
 */
public class preimageSizeFZF {

    // f(x) 是 x! 末尾是0的数量。（回想一下 x! = 1 * 2 * 3 * ... * x，且0! = 1）
    //
    //例如， f(3) = 0 ，因为3! = 6的末尾没有0；而 f(11) = 2 ，因为11!= 39916800末端有2个0。给定 K，找出多少个非负整数x ，有 f(x) = K 的性质。

    //1 2 5 10 15 20 25 30 35 40 45 50
    public int preimageSizeFZF(int K) {
        int i=1,sum=1;
        while(K>sum)    sum+=(i*=5);//sum=1+5+25+125+...
        if(K<sum)//保证K>=sum
        {
            sum-=i;
            i/=5;
        }
        int c=K-sum;//求差值
        while(c>0)
        {
            if(sum==1&&K==5)    return 0;
            if(c/sum==5||c%sum==5)  return 0;//差值与5有关的，就是无效
            c%=sum;
            sum-=i;
            i/=5;
        }
        return 5;
    }
}
