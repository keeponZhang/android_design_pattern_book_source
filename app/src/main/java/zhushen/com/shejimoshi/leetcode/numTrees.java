package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/21.
 */
public class numTrees {
    public int numTrees(int n) {
        int fuck[] = new int[n+1];

        fuck[0] = 1;
        fuck[1] = 1;

        for(int i = 2;i<=n;i++){
            for(int j = 0;j<i;j++){
                fuck[i] = fuck[j]*fuck[i-j-1] + fuck[i];
            }
        }
        return fuck[n];
    }
}
