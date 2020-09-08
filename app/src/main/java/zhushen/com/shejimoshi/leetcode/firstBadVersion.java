package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/16.
 */
public class firstBadVersion {
    public static void main(String[] argas){

        //
        //
        int n = firstBadVersion(2126753390);
        int i = 0;
    }


    public static int firstBadVersion(int n) {
        return findFirstVersion(0,n);
    }

    public static int findFirstVersion(int start,int end){
        int middle =start + (end -start)/2;
        if(middle == start){
            return end;
        }
        if(isBadVersion(middle)){
            return findFirstVersion(start,middle);
        }else {
            return findFirstVersion(middle,end);
        }
    }

    static boolean isBadVersion(int version){
        if(version>=1702766719){
            return true;
        }
        return false;
    }
}
