package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/11.
 */
public class findIntegers {
    //0 : 0
    //1 : 1
    //2 : 10
    //3 : 11
    //4 : 100
    //5 : 101
    //6 : 110
    //7 : 111
    //8 : 1000
    //9 : 1001
    public int findIntegers(int num) {
        if(num==0) return 1;
        String binary = Integer.toBinaryString(num);
        int len=binary.length();
        int[] f = new int[len+1];
        f[0]=1;
        f[1]=2;
        //计算场i的二进制位符合要求的个数
        for(int i=2; i<=len; i++) {
            f[i] = f[i-1]+f[i-2];
        }
        //计算0~n的符合要求的总个数
        int sum=0;
        for(int i=0, k=len; i<len; i++,k--) {
            if(binary.charAt(i)=='1') {
                sum+=f[k-1];
                if(i>0 && binary.charAt(i-1)=='1') {
                    return sum;
                }
            }
        }
        //先前没有return，到这里，说明n本身没有算进去
        sum++;

        return sum;
    }
}
