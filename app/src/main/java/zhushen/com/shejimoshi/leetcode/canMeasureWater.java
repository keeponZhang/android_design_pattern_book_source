package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/31.
 */
public class canMeasureWater {


    public boolean canMeasureWater(int x, int y, int z) {
        int min=0,max=0;
        if(x==0 || y==0){
            if(z==y || z==x){
                return true;
            }else{
                return false;
            }
        }
        if(x>y){
            max=x;min=y;
        }else{
            max=y;min=x;
        }
        int t = find(min,max);
        if(z%t==0 && z<=(x+y)){
            return true;
        }else{
            return false;
        }
    }

    public static int find(int min,int max){
        if(max%min == 0){
            return min;
        }
        int i = min-1;
        while(i>1){
            if(max%i==0 && min%i==0){
                return i;
            }
            i--;
        }
        return 1;
    }
}
