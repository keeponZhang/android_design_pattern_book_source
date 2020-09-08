package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/19.
 */
public class isBipartite {
    public boolean isBipartite(int[][] graph) {
        int len = graph.length;
        int color[] = new int[len];
        for(int i = 0;i<len;i++){
            if(color[i]==0&&dfs(i,color,2,graph)==false)
                return false;
        }
        return true;
    }

    public boolean dfs(int i,int []color,int t,int [][]graph){
        if(color[i]!=0)
            return color[i]==t;
        color[i] = t;
        for(int j:graph[i]){
            if(dfs(j,color,3-t,graph)==false)
                return false;
        }
        return true;
    }
}
