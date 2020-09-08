package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/17.
 */
public class reorganizeString {
    public String reorganizeString(String S) {
        int N = S.length();
        int[] cnt = new int[256];//count ASCII(256)
        char mc = 'a';//most frequent char(default 'a')
        //Frequency statistics
        for(char c:S.toCharArray())
        {
            cnt[c]++;
            mc = (cnt[c]>cnt[mc])?c:mc;//most frequent char
        }
        //return ""
        if((N-cnt[mc])<(cnt[mc]-1))
            return "";
        //return one possible case
        StringBuilder[] sb = new StringBuilder[cnt[mc]];
        for(int i=0;i<cnt[mc];i++)
        {
            sb[i] = new StringBuilder();
            sb[i].append(mc);
        }
        int k = 0;
        //Loop interpolation
        for(char c ='a';c<='z';c++)// defult in a~z
        {
            while(cnt[c]>0&&c!=mc)
            {
                sb[k++].append(c);
                cnt[c]--;
                k%=cnt[mc];//loop
            }
        }
        for(int i=1;i<cnt[mc];i++)
            sb[0].append(sb[i]);
        return sb[0].toString();


    }

}
