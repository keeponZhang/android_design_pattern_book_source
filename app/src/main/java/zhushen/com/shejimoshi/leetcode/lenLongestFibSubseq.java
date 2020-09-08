package zhushen.com.shejimoshi.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhushen on 2018/8/31.
 */
public class lenLongestFibSubseq {
    public int lenLongestFibSubseq(int[] A) {
        int retData = 0;
        int length = A.length;
        Map<Integer,Integer> dataMap = new HashMap<>();
        for(int i=0;i<length;i++){
            dataMap.put(A[i],i);
        }
        int[][] tmpData = new int[length][length];
        for(int i=length-1; i>=0; i--){
            for(int j=i+1; j<length; j++){
                if(dataMap.get(A[i] + A[j]) != null){
                    int tmp = A[i] + A[j];
                    int position = dataMap.get(tmp);
                    tmpData[i][j] = tmpData[j][position] + 1;
                    retData = Math.max(retData,tmpData[i][j]);
                }else {
                    tmpData[i][j] = 2;
                }
            }
        }
        return retData;

    }
}
