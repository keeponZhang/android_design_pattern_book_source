package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/8.
 */
public class computeArea {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        long area1=(C-A)*(D-B);
        long area2=(G-E)*(H-F);
        long overLapArea=getOverLapArea(A,B,C,D,E,F,G,H);
        return (int)(area1+area2-overLapArea);
    }

    public long getOverLapArea(int a, int b, int c, int d, int e, int f, int g,int h) {
        long aa=Math.max(a, e) , bb=Math.min(c, g);
        long len1=(long)(bb-aa);
        if(len1<=0)
            return 0;

        long cc=Math.max(b, f) , dd=Math.min(d, h);
        long len2=(long)(dd-cc);
        if(len2<=0)
            return 0;
        else
            return len1*len2;
    }

}
