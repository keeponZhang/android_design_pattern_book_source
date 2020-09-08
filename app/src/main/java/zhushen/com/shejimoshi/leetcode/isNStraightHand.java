package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/9/17.
 */
public class isNStraightHand {
    public boolean isNStraightHand(int[] hand, int W) {
        int n=hand.length;
        if(n%W!=0){
            return false;
        }
        Arrays.sort(hand);
        int[] vis=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                int cnt=1;
                vis[i]=1;
                int pre=hand[i];
                int j=i+1;
                while(cnt<W){
                    if(j>=n){
                        break;
                    }
                    if(vis[j]==0 && hand[j]==pre+1){
                        cnt++;
                        vis[j]=1;
                        pre=hand[j];
                    }
                    j++;
                }
                if(cnt!=W){
                    return false;
                }

            }
        }
        return true;
    }
}
